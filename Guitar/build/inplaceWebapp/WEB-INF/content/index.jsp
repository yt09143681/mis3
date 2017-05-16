<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>guitar</title>
<script src="http://www.jq22.com/jquery/1.7.2/jquery.min.js"></script>
<script type="text/javascript" src="lib/jquery.poshytip.js"></script>
<script type='text/javascript' src='lib/jq.validate.js'></script>
<link rel="stylesheet" type="text/css" href="reset.css" />
<link rel="stylesheet" type="text/css" href="lib/tip-yellowsimple/tip-yellowsimple.css" />
<style type="text/css">
td { padding: 7px; }
.labels { text-align: right; }
</style>
<script type="text/javascript">

$(function(e) {

	var vali=new Validators();

	$("#btn").bind("click", vali.subByJs);

});

</script>
</head>

<body>
<form action="guitar_Guitar" name="index">
  <div align="center">
    <h1>GUITAR</h1>
    <br />
    <table width="30%" border="0">
      <tr>
        <td class="labels">builder:</td>
        <td><input type="text" id="t1" name="builder" /></td>
      </tr>
      <tr>
        <td class="labels">model:</td>
        <td><input type="text" name="model"  /></td>
      </tr>
      <tr>
        <td class="labels">type:</td>
        <td><input type="text" name="type" /></td>
      </tr>
      <tr>
        <td class="labels">backWood:</td>
        <td><input type="text" name="backWood" /></td>
      </tr>
      <tr>
        <td class="labels">topWood:</td>
        <td><input type="text" name="topWood" /></td>
      </tr>
 <tr>       
        <td><center><input type="submit"  value="submit"/></center></td>
      </tr>
    </table>
  </div>
</form>
</body>
</html>