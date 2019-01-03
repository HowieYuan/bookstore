const orderId = GetQueryString();

$(function () {
    $.ajax({
        url: "http://localhost:8080/orderInformation/" + orderId,
        type: "GET",
        dataType: "json",
        data: {},
        traditional: true,
        success: function (e) {
            s = ["<div class=\"information-panel\">",
                "    <div class=\"information\">订单编号：" + e.message.orderId + "</div>",
                "    <br>",
                "    <div class=\"information\">购买者姓名：" + e.message.reader.name + "</div>",
                "    <br>",
                "    <div class=\"information\">书名：<a class='information' href='bookInformation.html?id=book" + e.message.bookId +
                    "'>《" + e.message.bookName + "》</a></div>",
                "    <br>",
                "    <div class=\"information\">数量：" + e.message.bookNum + "</div>",
                "    <br>",
                "    <div class=\"information\">总价：" + e.message.amount + "</div>",
                "    <br>",
                "    <div class=\"information\">支付方式：" + e.message.paymentMethod + "</div>",
                "    <br>",
                "</div>",
                "<div class=\"information-panel\">",
                "    <div class=\"information\">订单状态：" + e.message.status + "</div>",
                "    <br>",
                "    <div class=\"information\">地址：" + e.message.adress + "</div>",
                "    <br>",
                "    <div class=\"information\">交易时间：" + e.message.date + "</div>",
                "    <br>",
                "    <div class=\"information\">快递公司：" + e.message.express + "</div>",
                "    <br>",
                "</div>"].join("");
            $("#content").html(s);
        },
        error: function (e) {
            alert("error");
            console.log(e);
        }
    })
});


/**
 * @return {string} id
 */
function GetQueryString() {
    const reg = new RegExp("(^|&)" + "id" + "=([^&]*)(&|$)");
    const r = window.location.search.substr(1).match(reg);
    if (r !== null) {
        return unescape(decodeURI(decodeURI(r[2])));
    }
    return null;
}