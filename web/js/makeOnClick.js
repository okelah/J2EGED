var makeOnClick = function() {
    console.log("makeOnClick");
    var link;
    var links = $(".ui-datagrid td a");
    for (var i = 0; i < links.length; i++) {
        link = links[i];
        var onclick = $(link).attr("onclick");
        var cell = $(link).parents("td.ui-datagrid-column");
        cell.attr("onclick", onclick);
    }
    links = $(".ui-datatable td a");
    for (var i = 0; i < links.length; i++) {
        link = links[i];
        var onclick = $(link).attr("onclick");
        var cell = $($(link).parents(".ui-datatable-tablewrapper td")[0]);
        cell.attr("onclick", onclick);
    }
};
var cycleMakeOnClick = function() {
    setTimeout(makeOnClick ,250);
    setTimeout(makeOnClick ,500);
    setTimeout(makeOnClick ,1000);
    setTimeout(makeOnClick ,2000);
}

$(makeOnClick);
PrimeFaces.ab = function (cfg,ext){
    cycleMakeOnClick();
    return PrimeFaces.ajax.AjaxRequest(cfg,ext);
};
$('button.ui-fileupload-upload').on("click", cycleMakeOnClick);