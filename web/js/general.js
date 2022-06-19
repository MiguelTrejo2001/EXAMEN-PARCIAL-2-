$(document).ready(function () {
    listarProductos()
    listarVendedores();
    listarClientes();
    listarSucursales();
    listarVentas();
    
});
let precio;

function listarVentas() {

    $.get("TablaListars", {"opc": 1}, function (data) {
        
        let x = JSON.parse(data);
        $("#tablaListar tbody tr").remove();
        for (let i = 0; i < x.length; i++) {
            $("#tablaListar").append(
                    "<tr><td>" + x[i].idventa + "</td><td>" + (i + 1) + "</td><td>" + x[i].sucursal +
                    "</td><td>" + x[i].vendedor + "</td><td>"  + x[i].cliente + "</td><td>" + x[i].fecha + "</td><td><a href='#'><i class='fa-solid fa-eye'></i></a></td>");
        }
    });
}

function listarSucursales() {
    $.get("SucursalesController", {"opc": 1}, function (data)
    {
        let x = JSON.parse(data);
        for (let i = 0; i < x.length; i++) {
            $("#Sucursales").append($("<option>", {
                value: x[i].idsucursal,
                text: x[i].nombre
            })
            );
        }
    });
}    

function listarVendedores() {
    $.get("VendedoresController", {"opc": 1}, function (data)
    {
        let x = JSON.parse(data);
        for (let i = 0; i < x.length; i++) {

            $("#Vendedores").append($("<option>", {
                value: x[i].idvendedor,
                text: x[i].nombre
            })
            );
        }
    });
}


function listarClientes() {
    $.get("ClientesController", {"opc": 1}, function (data){
        let x = JSON.parse(data);
        for (let i = 0; i < x.length; i++) {

            $("#clientes").append($("<option>", {
                value: x[i].idcliente,
                text: x[i].nombre
            })
            );
        }
    });
}


function listarProductos() {
    
    $.get("ProductosController", {"opc": 1}, function (data)
    {
        let x = JSON.parse(data);
        precio=x;
        for (let i = 0; i < x.length; i++) {

            $("#productos").append($("<option>", {
                value: x[i],
                text: x[i].nombre
            
                })
            ); 
        }
        
    });
    
}


let mostrar = () => {

    var selected = $("#productos:selected").val();
    precio.forEach(function (elemento, indice, array) {
        
        if (elemento.idproducto == selected) {

            $('#productos').val(elemento.nombre);
            $('#precio').val("S/ " + elemento.precio);
            $('#stock').val(elemento.stock);
        }
    })
};

$('#agregar').click(mostrar);
