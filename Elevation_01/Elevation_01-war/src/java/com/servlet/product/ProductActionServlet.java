/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet.product;

import com.aptech.elevation.entity.Feedbacks;
import com.aptech.elevation.entity.Product;
import com.aptech.elevation.entity.session.FeedbacksFacadeLocal;
import com.aptech.elevation.entity.session.ProductFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author NeedMoney
 */
public class ProductActionServlet extends HttpServlet {
    @EJB
    private FeedbacksFacadeLocal feedbacksFacade;
    @EJB
    private ProductFacadeLocal productFacade;

    final Map<Integer, String> products = new HashMap<>();
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String action = req.getParameter("action");
        
        if (action == null)
            action = "browse";
        
        if("comment".equals(action))
        {
            String product=req.getParameter("product_id");
            Feedbacks fb=new Feedbacks();
            fb.setFeedbackFullname(req.getParameter("fullname"));
            fb.setFeedbackEmail(req.getParameter("email"));
            fb.setFeedbackDescription(req.getParameter("comments"));
            fb.setFeedbackStatus(false);
            fb.setFeedbackDate(Date.from(Instant.EPOCH));
            req.setAttribute("success",
                            "Comment Success!");
            feedbacksFacade.create(fb);
        req.getRequestDispatcher("index.jsp?page=product-detail&product_id="+product).forward(req, resp);
        }
        switch (action) {
            case "addToCart":
                this.addToCart(req, resp);
                break;
            case "viewCart":
                this.viewCart(req, resp);
                break;
            case "empty":
                this.empty(req, resp);
                break;
            case "browse":
                this.browse(req, resp);
                break;
        }
    }

    private void empty(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().removeAttribute("cart");
        browse(req, resp);
    }

    @SuppressWarnings("unchecked")
    private void viewCart(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, Integer> cart = (Map<String, Integer>) req.getSession().getAttribute("cart");
        req.setAttribute("cart", cart);
        req.getRequestDispatcher("/viewcart.jsp")
                .forward(req, resp);
    }

    @SuppressWarnings("unchecked")
    private void addToCart(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer productId = Integer.parseInt(req.getParameter("product_id"));

        HttpSession session = req.getSession();
        if (session.getAttribute("cart") == null) {
            session.setAttribute("cart", new HashMap<String, Integer>());
        }

        Map<String, Integer> cart = (Map<String, Integer>) session.getAttribute("cart");

        if (cart.containsKey(products.get(productId))) {
            cart.put(products.get(productId), cart.get(products.get(productId)) + 1);
        } else
            cart.put(products.get(productId), 1);

        resp.sendRedirect("ProductActionServlet?action=viewCart");

    }

    private void browse(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> list=productFacade.findAll();
        req.setAttribute("products", list);
        req.getRequestDispatcher("/browse.jsp").forward(req, resp);
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
