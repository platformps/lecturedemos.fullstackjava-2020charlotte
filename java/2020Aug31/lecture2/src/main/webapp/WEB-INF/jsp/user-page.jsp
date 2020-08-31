<h1>Confirm your Info</h1>
<div class="container">
    <form action="userInfo_confirm" method="POST">
        <div class="sub_field">
            <label>User Name</label>
            <label for="user"></label><input type="text" id="user" name = "username" value=${username} />
        <div>
        <div class="sub_field">
            <label>Password</label>
            <label for="pass"></label><input type="text" id="pass" name = "password" value=${password} />
        <div>
        <div class="sub_field">
            <label>Email</label>
            <label for="email"></label><input type="text" id="email" name = "email" value=${email} />
        <div>
        <div class="btn">
            <input type="submit" name="submit" value="Submit Info" />
        </div>
    </form>
</div>