function createXmlHttpRequest() {
    let request;
    try { // Opera, Firefox, Safari
        request = new XMLHttpRequest();
    } catch(e) {
        try { // Internet Explorer and Microsoft Edge
            request = new ActiveXObject("Msxml2.XMLHTTP")
        } catch(e) {
            try {
                request = new ActiveXObject("Microsoft.XMLHTTP")
            } catch(e) {
                alert("Your browser is out-dated!");
            }
        }
    }
}