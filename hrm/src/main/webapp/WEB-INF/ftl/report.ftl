<h3>人事月报</h3>
<table class="table" border="1">
    <thead>
    <tr>
        <th>部门编号</th>
        <th>月初人数</th>
        <th>月末人数</th>
        <th>本月新聘</th>
        <th>本月离职</th>
        <th>研究生</th>
        <th>本科</th>
        <th>专科</th>
        <th>高中及以下</th>
    </tr>
    </thead>
    <tbody>
<#list lee as le >
<#--<li style="color:green">${name}</li>-->

<tr>
    <td>${le.emp.dno}</td>
    <td>${le.personSta.mBegin}</td>
    <td>${le.personSta.mEnd}</td>
    <td>${le.personSta.newEmp}</td>
    <td>${le.personSta.dimEmp}</td>
    <td>${le.eduSta.master}</td>
    <td>${le.eduSta.bachelor}</td>
    <td>${le.eduSta.college}</td>
    <td>${le.eduSta.senior}</td>
</tr>
</#list>
    </tbody>
</table>

<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
