
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Formularz</title>
  </head>
  <body>

  <h1>Przelicznik metryczny</h1>
  <form method="post" action="/calcmeter">
    <label> metry <input type="number" name="m"></label><br/>
    <label> centyetry <input type="number" name="cm"></label><br/>
    <label> milimetry <input type="number" name="mm"></label>
    <input type="submit" name="Przelicz">
  </form>

  <h1>Przelicznik wag</h1>
  <form method="post" action="/calcweigh">
    <label> kilogramy<input type="number" name="kg"> </label><br/>
    <label> gramy<input type="number" name ="g"> </label><br/>
    <label> miligramy<input type="number" name="mg"> </label>
    <input type="submit" name="Przelicz">
  </form>

  </body>
</html>
