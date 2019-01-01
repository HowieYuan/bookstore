function add0(t) {
    return t < 10 ? "0" + t : t
}

function format(t) {
    var i = new Date(parseInt(t)), s = i.getFullYear(), a = i.getMonth() + 1, e = i.getDate(), n = i.getHours(),
        h = i.getMinutes(), $ = i.getSeconds();
    return s + "-" + add0(a) + "-" + add0(e) + " " + add0(n) + ":" + add0(h) + ":" + add0($)
}

function change_my_picture(t) {
    $("img").click(function () {
        var i = "<img src= " + t + "></img>";
        $("#dialog_large_image").html($(i).animate({height: "50%", width: "50%"}, 500))
    })
}

$(function () {
    $("#search input").focus(function () {
        myvalue = $(this).val(), $(this).val("")
    }), $("#search input").blur(function () {
        $(this).is("#userId") ? "" == $(this).val() && $(this).val("用户ID") : $(this).is("#userId2") ? "" == $(this).val() && $(this).val("用户ID") : $(this).is("#userId3") ? "" == $(this).val() && $(this).val("用户ID") : $(this).is("#userId6") ? "" == $(this).val() && $(this).val("用户ID") : $(this).is("#bossId") ? "" == $(this).val() && $(this).val("老板ID") : $(this).is("#playId") ? "" == $(this).val() && $(this).val("陪玩ID") : $(this).is("#playId4") ? "" == $(this).val() && $(this).val("陪玩ID") : $(this).parent().is("#from") ? "" == $(this).val() && $(this).val("请输入开始时间") : $(this).parent().is("#to") && "" == $(this).val() && $(this).val("请输入结束时间")
    })
}), $(function () {
    $("<span class='username'>" + localStorage.myUserName + "</span>").insertBefore(".quit"), $("button").click(function () {
        if ($(this).is(".quit")) return confirm("您确定要退出主页吗？") && (top.location = "../index.html"), !1
    })
});