<% @page import="com.github.perscholas.User" %>
<% User u = (User)session.getAttribute("userKey"); %>

<div class="user_table">
    <table>
        <tr>
            <td>User Name</td>
            <td><%=u.getUsername() %></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><%=u.getPassword() %></td>
        </tr>
        <tr>
            <td>Email</td>
            <td>${userKey.email}</td>
        </tr>
    </table>
    <a href="modify">Modify Your Info</a>
</div>