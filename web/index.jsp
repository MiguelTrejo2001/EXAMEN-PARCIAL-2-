<%-- 
    Document   : cat
    Created on : 5 jun. 2022, 18:43:21
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <script src="https://kit.fontawesome.com/3c0bd07c85.js" crossorigin="anonymous"></script>
        <title>EXAMEN 2</title>
        <%@include file="../WEB-INF/plantilla/head.jspf" %>
    </head>
    <body>
        <%@include file="../WEB-INF/plantilla/header.jspf" %>
        <div class="container pt-2">
            <div class="row pt-4" >
                <div class="col">
                    <div class="form-group">
                        <label for="sucursal" style="background-color:  white; color:#721c24 ">Sucursal:</label>
                        <select name="producto" id="Sucursales" class="form-control">
                            <option value="0">Seleccionar Sucursal</option>
                        </select>
                    </div>

                </div>
                <div class="col">
                    <div class="form-group">
                        <label for="sucursal" style="background-color: white">Cliente:</label>
                        <select name="cliente" id="clientes" class="form-control">
                            <option value="0">Seleccionar Cliente</option>
                        </select>
                    </div>

                </div>
                <div class="col">
                    <div class="form-group">
                        <label for="sucursal" style="background-color: white">Vendedor:</label>
                        <select name="vendedor" id="Vendedores" class="form-control">
                            <option value="0">Seleccionar Vendedor</option>
                        </select>
                    </div>

                </div>
                 <div class="col">
                    <div class="form-group">
                        <label for="sucursal" style="background-color: white">Producto:</label>
                        <select name="producto" id="productos" class="form-control">
                            <option value="0">Seleccionar Producto</option>
                        </select>
                    </div>

                </div>


            </div>
            <div class="row col-1 col-lg-1">
               <br> 

                <button id="agregar" class="btn-info" type="submit">AGREGAR</button>

            </div>
            <div class="row pt-4">
                <div class="col">
                    <select class="custom-select mr-sm-2" id="inlineFormCustomSelect">
                        <option selected>Cantidad</option>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="1">4</option>
                    </select>
                </div>
                <div class="col">
                    <input type="text" readonly="readonly" id="productos" class="form-control" placeholder="Producto">
                </div>
                <div class="col">
                    <input type="text" readonly="readonly" id="precio" class="form-control" placeholder="Precio">
                </div>
                <div class="col">
                    <input type="text" readonly="readonly" id="stock" class="form-control" placeholder="Stock">
                </div>
                <div class="col">
                    <button type="button" style="witdh: 200px; height: 40px; margin-top: -1px" class="btn-success">COMPLETAR VENTA</button>
                </div>
            </div>    
            <br>
            <table class="table w-100" id="tablaListar">
            <thead>
                <tr>
                    <th scope="col">Nº</th>
                    <th scope="col">Id</th>
                    <th scope="col">Sucursal</th>
                    <th scope="col">Vendedor</th>
                    <th scope="col">Cliente</th>
                    <th scope="col">Fecha</th>
                    <th scope="col">Detalle venta</th>
                </tr>
            </thead>
            <tbody>                
            </tbody>
        </table>
            
        </div>
        <%@include file="../WEB-INF/plantilla/footer.jspf" %>
        <script src="js/general.js"></script>  
    </body>
</html>
