<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="ab" %>    
    
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Smartisan</title>
	<link href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap.min.css" rel="stylesheet">
	<script src="js/jquery-1.12.3.js" type="text/javascript" charset="utf-8"></script>
	<script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
	<script src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
	<style type="text/css">
		.item .imgs{
			width: 100%;
			
		}
		.btn-success {
			float:right;	
		}
		.over{
			overflow: hidden;
		}
		.title {
			text-align:center;
			/* 显示省略号来代表被修减的文本 */
			text-overflow:ellipsis;
			/* 文本不换行 */
			white-space:nowrap;
			/* 多余的内容隐藏 */
			overflow:hidden;
		}
	</style>
</head>
<body>

		<nav class="navbar navbar-fixed-top navbar-inverse" >
			
		  <ul class="nav navbar-nav">			
			<li><a href="#">关于我们</a></li>
			<li><a href="#">商品展示</a></li>
			<li><a href="#">联系我们</a></li>
			<li><a href=""></a></li>
		  </ul>
		</nav>
		<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">

  <div class="carousel-inner" style="margin-top: 60px" role="listbox">
    <div class="item active">
      <img class="imgs" style="height:450px" src="images/3.jpg" alt="...">
      <div class="carousel-caption">
        ...
      </div>
    </div>
    <div class="item">
      <img class="imgs" style="height:450px" src="images/2.jpg" alt="...">
      <div class="carousel-caption">
        ...
      </div>
    </div>
    <div class="item">
      <img class="imgs" style="height:450px" src="images/1.jpg" alt="...">
      <div class="carousel-caption">
        ...
      </div>
    </div>
    ...
  </div>

  <!-- Controls -->
  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
<div class="container" >
	<div class="row"></div>
	<div class="row">
		
	
		
		<ab:iterator value="goodslist">
		
		<div class="col-sm-6 col-md-4">
			<div class="thumbnail">
				<a href=""></a>
				<img src='<ab:property value="g_img" />'>
			</div>
			<div class="caption">
				<h2 class="title" title="">   <ab:property value="g_name" />   </h2>
				<p class="over">
					<span class="money">¥<ab:property value="g_price" />   </span>
					<button type="button" class="btn btn-success" onclick="javascript:window.location.href='bookinfo.php?bookid='">立即购买</button>
				</p>
			</div>
		</div>
		
		</ab:iterator>
		
	</div>
	<div class="row"  style="text-align: center;" >
		
	
	<nav aria-label="Page navigation">
	  <ul class="pagination">
	    <li>
	      <a href="#" aria-label="Previous">
	        <span aria-hidden="true">&laquo;</span>
	      </a>
	    </li>
	    <li><a href="#">1</a></li>
	    <li><a href="#">2</a></li>
	    <li><a href="#">3</a></li>
	    <li><a href="#">4</a></li>
	    <li><a href="#">5</a></li>
	    <li>
	      <a href="#" aria-label="Next">
	        <span aria-hidden="true">&raquo;</span>
	      </a>
	    </li>
	  </ul>
	</nav>
</div>
</div>
		
<script type="text/javascript">
	console.log($('.carousel'));
	$('.carousel').carousel({
	  interval: 2000
	})

</script>

</body>
</html>