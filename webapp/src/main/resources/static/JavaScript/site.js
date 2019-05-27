console.log("js is loaded");
var isHidden = true;
var sectorIsHidden = true;

$(function () {
    $('#displayForm').click(function () {
        if (isHidden) {
            $('#siteForm').show();
            $('#displayForm').text('Annuler');
            isHidden = false;
        } else {
            $('#siteForm').hide();
            $('#displayForm').text('Ajouter une voie');
            isHidden = true;
        }
        $("input[type=checkbox]").on("click", function () {
            if ($('input[type=checkbox]').prop('checked')) {
                $('#sectorDiv').show();
            } else {
                $('#sectorDiv').hide();
                // on enlève également le form
                $('#sectorForm').hide();
                $('#displaySectorForm').text('Créer un secteur');
                sectorIsHidden = true;
                $('.routeInput').prop('disabled', false);
            }
        })

        $('#displaySectorForm').click(function () {
            if (sectorIsHidden) {
                $('#sectorForm').show();
                $('#displaySectorForm').text('Annuler');
                sectorIsHidden = false;
                $('.routeInput').prop('disabled', true);
            } else {
                $('#sectorForm').hide();
                $('#displaySectorForm').text('Créer un secteur');
                sectorIsHidden = true;
                $('.routeInput').prop('disabled', false);
            }
        })
    })
})

