/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.elevation.servlet.manager.product;

import com.aptech.elevation.entity.Category;
import com.aptech.elevation.entity.Product;
import com.aptech.elevation.entity.session.CategoryFacadeLocal;
import com.aptech.elevation.entity.session.ProductFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ThucNV
 */
public class ProductAddNewServlet extends HttpServlet {

    @EJB
    private ProductFacadeLocal productFacade;

    @EJB
    private CategoryFacadeLocal categoryFacade;

    private Product product;

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
        String price = !"".equals(request.getParameter("price")) ? request.getParameter("price") : "0";
        String quantity = !"".equals(request.getParameter("quantity")) ? request.getParameter("quantity") : "0";
        String description = request.getParameter("description");
        String image = request.getParameter("image");
        String category = request.getParameter("category");
        String status = request.getParameter("status");
        String discount = !"".equals(request.getParameter("discount")) ? request.getParameter("discount") : "0";

//        if (categoryFacade.checkName(name)) {
//            request.setAttribute("feildError", "name");
//            request.getRequestDispatcher("/manager/category/form.jsp").forward(request, response);
//        }
        if (request.getParameter("id") != null && !"".equals(request.getParameter("id"))) {
            int id = Integer.parseInt(request.getParameter("id"));
            product = productFacade.find(id);
        } else {
            product = new Product();
            product.setProductCreatedate(new Date());
        }

        product.setProductName(name);
        product.setProductPrice(Double.valueOf(price));
        product.setProductQuantity(Integer.valueOf(quantity));
        product.setProductDiscount(Double.parseDouble(discount));
        product.setProductDescription(description);
        product.setProductStatus(Boolean.getBoolean(status));
        product.setProductImage(image);
        product.setProductQuantity(Integer.parseInt(quantity));
        product.setCategoryId(categoryFacade.find(Integer.parseInt(category)));
        if (request.getParameter("id") != null && !"".equals(request.getParameter("id"))) {
            productFacade.edit(product);
        } else {

            productFacade.create(product);
        }
        response.sendRedirect(request.getContextPath() + "/manager/product/index.jsp");

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
