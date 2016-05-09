<%-- 
    Document   : registroempleado
    Created on : 07-may-2016, 16:57:14
    Author     : Windows7
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Empleado</title>
    </head>
    <body>
        <h1>Registro Empleado</h1>
        <p>${msg}</p>
        <p>${error}</p>

        <form method="post" action="AddCargo">
            <fieldset>
                <legend>Nuevo Cargo</legend>
                <p>Nombre Cargo: <input type="text" name="nombre"/></p>
                <input type="submit" value="Procesar"/>
                <br><br>
                <table border="1">                        
                    <thead>
                        <tr>
                            <th>Id Cargo</th>
                            <th>Nombre Cargo</th>

                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="r" items="${listaCargo}">
                        <tr>
                            <td>${r.idcar}</td>
                            <td>${r.nombre}</td>                                                                            
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </fieldset>
        </form>
        <form method="post" action="AddEmpleado">
            <fieldset>
                <legend>Ingrese los Datos</legend> 
                
                <p>Nombre: <input type="text" name="nombre"/></p>
                <p>Apellido Paterno: <input type="text" name="apellidopa"/></p>
                <p>Apellido Materno: <input type="text" name="apellidoma"/></p>
                <p>Dni: <input type="text" name="dni"/></p>
                <label for="txtCargo">Cargo:</label>
                <select name="idcar" id="cboListaCategoria">
                    <option value="">Seleccione Cargo</option>
                    <c:forEach var="var" items="${listaCargo}">
                        <option value="${var.idcar}">${var.nombre}</option>
                    </c:forEach>
                </select>
                <br><br>
                <p>Email: <input type="text" name="email"/></p>
                <p>Telefono: <input type="text" name="telefono"/></p>
                <p>Celular: <input type="text" name="celular"/></p>
                <p>Usuario: <input type="text" name="usuario"/></p>
                <p>Contraseña: <input type="text" name="clave"/></p>

                <input type="submit" value="Procesar"/>
                <br><br>
                <table border="1">                        
                    <thead>
                        <tr>
                            <th>Id Empleado</th>
                            <th>Nombre</th>
                            <th>Apellido Pa</th>
                            <th>Apellido Ma</th>
                            <th>Dni</th>
                            <th>Cargo</th>
                            <th>Email</th>
                            <th>Telefono</th>
                            <th>Celular</th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="u" items="${listaProducto}">
                        <tr>
                            <td>${u.idemp}</td>
                            <td>${u.nombre}</td>
                            <td>${u.apellidopa}</td>
                            <td>${u.apellidoma}</td>
                            <td>${u.dni}</td>
                            <td>${u.idcar}</td>
                            <td>${u.email}</td>
                            <td>${u.telefono}</td>
                            <td>${u.celular}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </fieldset>           
        </form>
    </body>
</html>
