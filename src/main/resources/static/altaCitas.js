$(document).ready(function() {
    console.log( "ready!" );

    $("#guardar").on( "click", function() {
        $.ajax({
            method: "POST",
            url: "/guardarCita",
            data: {
                paciente: $("#paciente").val(),
                fechaCita: $("#fechaCita").val(),
                horaCita: $("#horaCita").val(),
                doctor: $("#doctor").val(),
                consultorio: $("#consultorio").val()
            }
        })
            .done(function( msg ) {
                alert( "Data Saved: " + msg );
            });
    });
});