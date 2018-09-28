<html>
  <body>
    <h2>Hello World!</h2>

    <form action="form" method="post">
        <div style="color: #FF0000;">${firstNameError}</div>
        <div style="color: #FF0000;">${lastNameError}</div>
        <div style="color: #FF0000;">${emailError}</div>
        First name: <input type="text" name="firstName" value=${form.firstName}><br>
        Last name: <input type="text" name="lastName" value=${form.lastName}><br>
        Email: <input type="text" name="email" value=${form.email}><br>
        <input type="submit" value="Submit">
    </form>
  </body>
</html>
