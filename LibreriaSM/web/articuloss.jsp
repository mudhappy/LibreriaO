<%-- 
    Document   : articulo
    Created on : 06-may-2016, 15:39:26
    Author     : ALUMNO-UCH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Articulos</title>
    </head>
    <body>
        <h1>Registro Articulo</h1>
        <p>${msg}</p>
        <p>${error}</p>

        <form method="post" action="AddCategoria">
            <fieldset>
                <legend>Nueva Categoria</legend>
                <p>Nombre Categoria: <input type="text" name="nombre"/></p>
                <input type="submit" value="Procesar"/>
                <br><br>
                <table border="1">                        
                    <thead>
                        <tr>
                            <th>Id Categoria</th>
                            <th>Nombre Categoria</th>

                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="r" items="${listaCategoria}">
                            <tr>
                                <td>${r.idcat}</td>
                                <td>${r.nombre}</td>                                                                            
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </fieldset>
        </form>
        <form method="post" action="AddMarca">   
            <fieldset>
                <legend>Nueva Marca</legend>
                <p>Nombre Marca: <input type="text" name="nombre"/></p>
                <input type="submit" value="Procesar"/>
                <br><br>
                <table border="1">                        
                    <thead>
                        <tr>
                            <th>Id Marca</th>
                            <th>Nombre Marca</th>

                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="v" items="${listaMarca}">
                            <tr>
                                <td>${v.idmar}</td>
                                <td>${v.nombre}</td>                                                                            
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </fieldset>
        </form>
        <form method="post" action="AddProducto">
            <fieldset>
                <legend>Nuevo Articulo</legend>  


                <label for="txtCategoria">Categoria:</label>
                <select name="idcat" id="cboListaCategoria">
                    <option value="">Seleccione Categoria</option>
                    <c:forEach var="var" items="${listaCategoria}">
                        <option value="${var.idcat}">${var.nombre}</option>
                    </c:forEach>
                </select>
                <br><br>
                <label for="txtMarca">Marca:</label>
                <select name="idmar" id="cboListaMarca">
                    <option value="">Seleccione Marca</option>
                    <c:forEach var="var" items="${listaMarca}">
                        <option value="${var.idmar}">${var.nombre}</option>
                    </c:forEach>
                </select>  


                <p>Nombre: <input type="text" name="nombre"/></p>
                <p>Precio: <input type="text" name="precio"/></p>
                <p>Stock: <input type="text" name="stock"/></p>

                <input type="submit" value="Procesar"/>
          

                <br><br>
                <table border="1">                        
                    <thead>
                        <tr>
                            <th>Id Producto</th>
                            <th>Id Categoria</th>
                            <th>Id Marca</th>
                            <th>Nombre</th>
                            <th>Precio</th>
                            <th>Stock</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="u" items="${listaProducto}">
                            <tr>
                                <td>${u.idprod}</td>
                                <td>${u.idcat}</td>
                                <td>${u.idmar}</td>
                                <td>${u.nombre}</td>
                                <td>${u.precio}</td>
                                <td>${u.stock}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </fieldset>           
        </form>
        <form method="POST" action="UploadServlet" enctype="multipart/form-data">
            <!--<p>
                <!--<label>Nombre</label>
                <input type="text" name="nombre" placeholder="Nombre">
            </p>-->
            <p>
                <label>Selecciona la Imagen a subir:</label>
                <input type="file" name="file" id="fileChooser"/><br/><br/>
                <input type="submit" value="Subir" />
            </p>
        </form>
        <p>
         <h1>Imagen</h1>   
         <!--<label>Imagen: ${nombre}</label> -->
         <img src="${file}" width="300">
        </p>
    </body>
</html>
