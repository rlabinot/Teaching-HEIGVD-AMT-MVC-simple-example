<html>
  <body>
    <h2>Hello World!</h2>

    <form action="form" method="post">
        First name: <input type="text" name="firstName" value=${form.firstName}><br>
        Last name: <input type="text" name="lastName" value=${form.lastName}><br>
        Email: <input type="text" name="email" value=${form.email}><br>
        <input type="submit" value="Submit">
    </form>
  </body>
</html>
