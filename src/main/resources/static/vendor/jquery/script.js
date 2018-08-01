$(document).ready(function () {
    $("img").click(function () {
        alert("The image was clicked.");
    });

    $(function() {
        $('.allowCopy').click(function() {
            $(this).focus();
            $(this).select();
            document.execCommand('copy');
        });
    });

});