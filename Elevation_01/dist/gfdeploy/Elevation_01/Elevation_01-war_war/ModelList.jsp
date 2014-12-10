<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <title>www.tech-freaks.in - Model List</title>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
    </head>
    <body>
        <p><font size="3" face="Verdana, Arial, Helvetica, sans-serif"><strong>Model List 
                </strong></font></p>
        <a href="ShoppingCart.jsp">View Cart</a>
        
        <table width="75%" border="1">
            <tr> 
                <td><form name="modelDetail1" method="POST" action="servlet/CartController">
                        <strong>Model:</strong> 
                            TF-Model1<input type="hidden" name="modelNo" value="TF-MODEL1">
                        <p><strong>Description:</strong> 
                         Tech-Freaks imaginary model 1. 
                        <input type="hidden" name="description" value="Tech-Freaks imaginary model 1."></p>
                        <p><strong>Quantity:<input type="text" size="2" value="1" name="quantity"></strong></p>
                        <p><strong>Price:</strong> 
                                $10.00<input type="hidden" name="price" value="10"></p>
                        <input type="hidden" name="action" value="add"><input type="submit" name="addToCart" value="Add To Cart">
                    </form>
            </tr>>

        </table>
    </body>
</html>