<%@
    page language="java"
    contentType="text/html; charset=ISO8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@
        taglib uri = "http://www.springframework.org/tags/form"
        prefix="form" %>

<h1>Welcome to the Simple Application</h1>
    <form:form action="userInfo" method="POST">
        <div class="sub_field">
            <label>User Name</label>
            <input type="text" id="user" name="username" />
        </div>

        <div class="sub_field">
            <label>Password</label>
            <input type="text" id="password" name="password" />
        </div>

        <div class="sub_field">
            <label>Email</label>
            <form:input type="text" id="email" name="email" />
            <form:errors path="email"/>
        </div>

        <div class="btn">
            <input type="submit" name="submit" value="Submit Info" />
        </div>
    </form:form>
</div>