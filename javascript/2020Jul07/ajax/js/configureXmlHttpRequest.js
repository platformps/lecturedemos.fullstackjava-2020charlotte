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


class Response {
    constructor(id, authToken, body) {
        this.id =id;
        this.authToken = authToken;
        this.body = body;
    }
}

class Person {
    constructor(fname, lname, birthdate) {
        this.fname = fname;
        this.lname = lname;
        this.birthdate = birthdate;
    }
}

let leon1 = new Person("Leon", "Hunter", "01/01/01");
let leon2 = {
    fname: "leon",
    lname: "hunter",
    birthdate: "01/01/01"
};
let leon3 = new Person(leon2);


let haseeb1 = new Person("Muhammad", "Haseeb", "01/01/01");
let haseeb2 = {
    fname: "Muhammad",
    lname: "Haseeb",
    birthdate: "01/01/01"
};



function updateDom(response) {
    let exepctedResponseBody = {
        id: 0,
        authToken: "83902312809adjldasjkl#$%^&adshjk13DBGAHSJ",
        body: {
            fname: "leon",
            lname: "hunter",
            birthdate: "01/01/01"
        }
    };

    let someValue2;
    let someValue3;
    if(response== exepctedResponseBody) {
        document.writeln("manipulation 1")
    }

    if(response == someValue2) {
        document.writeln("manipulation 2")
    }

    if(response == someValue3) {
        document.writeln("manipulation 2")
    }
}


function makeAsynchronousRequestToWebserver() {
    let request = createXmlHttpRequest();
    configureXmlHttpRequest(request);
    request.open("GET", "https://www.msn.com/", false);
    let response = request.send(null);
    console.log(response);
}


async function makeAsynchronousRequestToWebserver() {
    let request = await createXmlHttpRequest();
    configureXmlHttpRequest(request);
    request.open("GET", "https://www.msn.com/" );
    let response = request.send(null);
    console.log(response);
}