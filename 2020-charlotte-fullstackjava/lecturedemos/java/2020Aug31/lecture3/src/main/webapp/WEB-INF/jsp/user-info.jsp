<h1>Confirm your Info</h1>
<div class="container">
    <form action="userInfoConfirm" method="POST">
        <div class="sub_field">
            <label>User Name</label>
            <input type="text" id="user" name = "username" value=${username} />
        </div>
        <div class="sub_field">
            <label>Password</label>
            <input type="password" id="pass" name = "password" value=${password} />
        </div>
        <div class="sub_field">
            <label>Email</label>
            <input type="text" id="email" name = "email" value=${email} />
        </div>
        <div class="btn">
            <input type="submit" name="submit" value="Submit Info" />
        </div>
    </form>
</div>