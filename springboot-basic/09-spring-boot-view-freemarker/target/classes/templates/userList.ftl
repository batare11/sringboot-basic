<html>
  <head>
    <title>用户列表</title>
    <meta charset="utf-8></meta>
  </head>
  <body>
      <table align="center" border="1" width="50%">
      	<tr>
      		<th>ID</th>
      		<th>NAME</th>
      		<th>AGE</th>
      	</tr>
      	<#list list as user>
      		<tr>
      			<td>${user.id}</td>
      			<td>${user.name}</td>
      			<td>${user.age}</td>
      		</tr>
      	</#list>
      </table>
  </body>
</html>