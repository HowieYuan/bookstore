const bookId = GetQueryString();

/**
 * @return {string} id
 */
function GetQueryString() {
    const reg = new RegExp("(^|&)" + "id" + "=([^&]*)(&|$)");
    const r = window.location.search.substr(1).match(reg);
    if (r !== null) {
        s = unescape(decodeURI(decodeURI(r[2])));
        return s.substring(4, s.length);
    }
    return null;
}


$(function () {
    $.ajax({
        url: "http://localhost:8080/bookInformation/" + bookId,
        type: "GET",
        dataType: "json",
        data: {},
        traditional: true,
        success: function (e) {
            s = ["<div class=\"indent\">",
                "    <div id=\"mainpic\">",
                "        <img src='" + e.message.imageURL + "'",
                "             style=\"width: 135px;max-height: 183px;\"/>",
                "    </div>",
                "    <div id=\"info\">",
                "        <span class=\"pl\">书名：</span>" + e.message.name + "<br>",
                "        <span class=\"pl\">作者：</span>" + e.message.author + "<br>",
                "        <span class=\"pl\">类别：</span>" + e.message.category + "<br>",
                "        <span class=\"pl\">价格：</span>" + e.message.price + "<br>",
                "        <span class=\"pl\">库存：</span>" + e.message.quantity + "<br>",
                "        <span class=\"pl\">页数：</span>" + e.message.pageNum + "<br>",
                "        <span class=\"pl\">出版社：</span>" + e.message.press + "<br>",
                "        <span class=\"pl\">ISBN：</span>" + e.message.isbn + "<br>",
                "    </div>",
                "</div>",
                "<div class=\"related_info\">",
                "    <h2>",
                "        <span class=\"\">内容简介</span>",
                "        &nbsp;·&nbsp;·&nbsp;·&nbsp;·&nbsp;·&nbsp;·",
                "    </h2>",
                "    <div>" + e.message.authorIntroduction + "</div>",
                "    <h2>",
                "        <span class=\"\">作者简介</span>",
                "        &nbsp;·&nbsp;·&nbsp;·&nbsp;·&nbsp;·&nbsp;·",
                "    </h2>",
                "    <div>" + e.message.introduction + "</div>",
                "</div>"].join("");
            $("#content").html(s);
        },
        error: function (e) {
            alert("error");
            console.log(e);
        }
    })
});