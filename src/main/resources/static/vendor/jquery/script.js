$(document).ready(function () {
    $('div div div a').click( function(){
        if ( $(this).hasClass('mark favorite') ) {
            $(this).removeClass('mark favorite');
            $(this).addClass('unmark favorite');
        } else {
            $('div div div a').removeClass('unmark favorite');
            $(this).addClass('mark favorite');
        }
    });

    $.ajax({
        type: "GET",
        url: "http://localhost:8080/api/gif",
        data: {id:  $('#details').attr("gif-id")}
    }).then(function(data) {

    });
});
