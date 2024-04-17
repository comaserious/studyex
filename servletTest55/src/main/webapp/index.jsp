<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
    <h1 style="text-align: center ; font-weight: bold; color: red">Memu Selector</h1>
    <form action="savingServlet">
      <label for="MenuName">메뉴 : </label>
      <select name="MenuName" id="MenuName">
        <option value="햄버거">햄버거</option>
        <option value="짜장면">짜장면</option>
        <option value="짬뽕">짬뽕</option>
      </select>
      <label for="amount">수량 : </label>
      <input type="number" name="amount" id="amount" min="0" max="100" step="1">
        <button type="submit">주문하기</button>
    </form>
</body>
</html>