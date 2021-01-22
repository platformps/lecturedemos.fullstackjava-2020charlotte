let button = document.getElementById("button");
button.onclick = makeAsynchronousRequestToWebserver;


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


function configureXmlHttpRequest(request) {
    request.onreadystatechange = function() {
        // request finished and response is ready
        if(request.readyState == 4) {
            updateDom(request);
        }
    }
    console.log("onreadystatechange calls the callback() function is = " + request.onreadystatechange)
    console.log("The readyState at this point is = " + request.readyState);
}


function updateDom(request) {
    document.write(request.response);
}

function makeAsynchronousRequestToWebserver() {
    let request = createXmlHttpRequest();
    configureXmlHttpRequest(request);
    request.open("GET", "https://www.msn.com/", false);
    request.send(null);
    console.log(request.response);
}