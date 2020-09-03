let button = document.getElementById("button");
button.onclick = createXmlHttpRequest;

function createXmlHttpRequest() {
    let request;
    try { // Opera 8.0+, Firefox, Safari
        request = new XMLHttpRequest();
    } catch(someError) {
        try { // Internet Explorer Browser
            request = new ActiveXObject("Msxml2.XMLHTTP");
        } catch(someError) {
            try {
                request = new ActiveXObject("Microsoft.XMLHTTP");
            } catch(someError) {
                alert("Download a better browser");
            }
        }
    }
    return request;
}
