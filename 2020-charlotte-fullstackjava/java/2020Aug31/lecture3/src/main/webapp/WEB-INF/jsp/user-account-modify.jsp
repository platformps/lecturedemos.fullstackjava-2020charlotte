<% User u = (User)session.getAttribute("userKey"); %>
<h1>Change User Information</h1>
<div class="container">
    <form action="submit-changes" method="POST">
        <div class="sub_field">
            <label>User Name</label>
            <input type="text" id="user" name="username"
                value=<%=u.getPassword()%> />
        </div>
        <div>
            <label>Password</label>
            <input type="password" id="pass" name="password"
                value=<%=u.getPassword() %> />
        </div>
        <div>
            <label>Email</label>
            <input type="text" id="email" name="email"
                value=<%=u.getEmail()%> />
        </div>
        <div class="btn">
            <input type="submit" name="submit" value="Change Info" />
        </div>
    </form>
</div>