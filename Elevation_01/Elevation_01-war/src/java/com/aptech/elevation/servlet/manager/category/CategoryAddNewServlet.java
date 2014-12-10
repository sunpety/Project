/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.elevation.servlet.manager.category;

import com.aptech.elevation.entity.Category;
import com.aptech.elevation.entity.session.CategoryFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ThucNV
 */
public class CategoryAddNewServlet extends HttpServlet {


    @EJB
    private CategoryFacadeLocal categoryFacade;

    private Category category;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String image = request.getParameter("image");
        String parent = request.getParameter("parent");
//        if (categoryFacade.checkName(name)) {
//            request.setAttribute("feildError", "name");
//            request.getRequestDispatcher("/manager/category/form.jsp").forward(request, response);
//        }
        if (request.getParameter("id") != null && !"".equals(request.getParameter("id"))) {
            int id = Integer.parseInt(request.getParameter("id"));
            category = categoryFacade.find(id);
        } else {
            category = new Category();
        }

        category.setCategoryName(name);
        category.setCategoryDescription(description);
        category.setCategoryImage(image);
        if (!parent.equals("")) {
            Category categoryParent = categoryFacade.find(Integer.parseInt(parent));
            category.setCategoryParent(categoryParent);
        }
        if (request.getParameter("id") != null && !"".equals(request.getParameter("id"))) {
            categoryFacade.edit(category);
        } else {

            categoryFacade.create(category);
        }
        response.sendRedirect(request.getContextPath() + "/manager/category/index.jsp");

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
