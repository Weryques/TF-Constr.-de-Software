<!--A Design by W3layouts 
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
<head>
<title>Supermercado Único</title>
<link href="../css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="../js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="../css/styleHomeLoginCarrinho.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Food shop Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--fonts-->
<link href='http://fonts.googleapis.com/css?family=Rokkitt:400,700' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Lobster+Two:400,400italic,700,700italic' rel='stylesheet' type='text/css'>
<!--//fonts-->

<link href="../css/bootstrap.min.css" rel="stylesheet">
<link href="../css/style.css" rel="stylesheet">

<script type="text/javascript" src="../js/move-top.js"></script>
<script type="text/javascript" src="../js/easing.js"></script>
				<script type="text/javascript">
					jQuery(document).ready(function($) {
						$(".scroll").click(function(event){		
							event.preventDefault();
							$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
						});
					});
					</script>

</head>
<body>
	<!--header-->
	<div class="header">
		<div class="container">
			<div class="logo">
				<h1><a href="home.jsp">Supermercado Único</a></h1>
			</div>
			<div class="header-top">
				<div class="header-top-in">
					<ul class="header-grid">
						<li  ><a href="account.html">Minha conta   </a> <label>/</label></li>
						<li ><a href="loginpessoafisica.jsp">  Entrar </a> </li>		
					</ul>
				<div class="clearfix"> </div>
				</div>
				<ul class="grid-header">
					<li><a href="#" class="glyphicon glyphicon-user"><span ></span>Usuário  </a><label>/</label></li>
       			 	<li><a href="carrinhocompras.jsp" class="glyphicon glyphicon-shopping-cart"><span ></span>Carrinho  </a><label>/</label></li>
     				<li><a href="../loginpessoajuridica.jsp" class="glyphicon glyphicon-lock">Admin </a> </li>		
				</ul>
				<div class="clearfix"> </div>
			</div>
			<!---->
			<div class="header-bottom">
				<div class="top-nav">
					<span class="menu"> </span>
					<ul>
						<li class="active" ><a href="home.jsp" >Home  </a><label>- </label> </li>
					</ul>
					<!--script-->
				<script>
					$("span.menu").click(function(){
						$(".top-nav ul").slideToggle(500, function(){
						});
					});
			</script>
				</div>
					<div class="search">
						<form>
							<input type="text" value="Procurar aqui..." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}" >
							<input type="submit" value="">
						</form>
					</div>
			<div class="clearfix"> </div>
		</div>
		<!---->
	<div class="banner">
		<div class="banner-in">
		<!---->
		<div class="wmuSlider example1">
			   <div class="wmuSliderWrapper">
				<article style="position: absolute; width: 100%; opacity: 0;"> 
				   	<div class="banner-wrap">
				   	      <h2>Café </h2>
						  <h5>--</h5>
						  <p>-- <span>--</span></p>				   		 
				   	 </div>
					 
			</article>
			 <article style="position: absolute; width: 100%; opacity: 0;"> 
				   	<div class="banner-wrap">
					  		<h2>Café </h2>
						  <h5>--</h5>
						  <p>-- <span>--</span></p>
				   		 
				   	 </div>
					 
			</article>
			 <article style="position: absolute; width: 100%; opacity: 0;"> 
				   	<div class="banner-wrap">
				   	       <h2>Café </h2>
						  <h5>--</h5>
						  <p>-- <span>--</span></p>
				   		 
				   	 </div>
					 
			</article>
			</div>
		</div>
		<!---->
		  <script src="../js/jquery.wmuSlider.js"></script> 
			  <script>
       			$('.example1').wmuSlider({
					 pagination : false,
				});         
   		     </script> 	
		<!---->
	</div>
	</div>
		</div>
	</div>
	<!---->
	<div class="content">
		<div class="container">
		<div class="content-grid">
			<div class="col-md-4 grid-food">
				<div class="popular">
				<h3>Produtos populares</h3>
				<p>Produtos mais procurados</p>
				<ul class="popular-in">
					<li><a href="#"><i> </i>--</a></li>
					<li><a href="#"><i> </i>--</a></li>
					<li><a href="#"><i> </i>--</a></li>
					<li><a href="#"><i> </i>--</a></li>							
				</ul>
				</div>
				<div class="popular phone">
					<h3>E-mail/Telefone</h3>
					<p>Contate-nos</p>
					<ul class="number">
						<li><a href="mailto:superunico@servidor.com"><i class="mail"> </i>superunico@servidor.com </a></li>	
						<li><span><i> </i>(00) 0000-0000 </span></li>				
					</ul>
				</div>
			</div>
			<!---->
			<div class="col-md-8 food-grid">
				<div class="cup">
					<div class="col-md-4 cup-in">
						<a href="single.html"><img src="../images/p1.jpg" class="img-responsive" alt=""></a>
						<p>Lorem ipsum dolor sit consectetur</p>
						<span class="dollar">$25.89</span>
						<div class="details-in">
							<a href="#" class="details">Details</a>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="col-md-4 cup-in">
						<a href="single.html"><img src="../images/p2.jpg" class="img-responsive" alt=""></a>
						<p>Lorem ipsum dolor sit consectetur</p>
						<span class="dollar">$25.89</span>
						<div class="details-in">
							<a href="single.html" class="details">Details</a>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="col-md-4 cup-in">
						<a href="single.html"><img src="../images/p3.jpg" class="img-responsive" alt=""></a>
						<p>Lorem ipsum dolor sit consectetur</p>
						<span class="dollar">$25.89</span>
						<div class="details-in">
							<a href="single.html" class="details">Details</a>
						</div>
						<div class="clearfix"> </div>
					</div>
					
					<div class="col-md-4 cup-in">
						<a href="single.html"><img src="../images/p4.jpg" class="img-responsive" alt=""></a>
						<p>Lorem ipsum dolor sit consectetur</p>
						<span class="dollar">$25.89</span>
						<div class="details-in">
							<a href="single.html" class="details">Details</a>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="col-md-4 cup-in">
						<a href="single.html"><img src="../images/p5.jpg" class="img-responsive" alt=""></a>
						<p>Lorem ipsum dolor sit consectetur</p>
						<span class="dollar">$25.89</span>
						<div class="details-in">
							<a href="single.html" class="details">Details</a>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="col-md-4 cup-in">
						<a href="single.html"><img src="../images/p6.jpg" class="img-responsive" alt=""></a>
						<p>Lorem ipsum dolor sit consectetur</p>
						<span class="dollar">$25.89</span>
						<div class="details-in">
							<a href="single.html" class="details">Details</a>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<!---->
					<div class="browse">
						<p class="vit">Mollis vitae oigu edlobit <span>vulipur felis ...</span></p>
						<a href="single.html" class="more">Browse More</a>
						<div class="clearfix"> </div>
						<div class="arrow">
							<a href="#"><img src="../images/arrow.png" alt=""></a>
						</div>
					</div>
				<!---->
				<div class="content-sit">
					<div class="col-md-6 amet">
						<h3>Adpiscing labo</h3>
						<p>Lorem ipsum dolor sit amet </p>
						<div class="egg">
							<a href="single.html"><img src="../images/pic.jpg" class="img-responsive" alt=""></a>
						</div>
						<p class="para-in">Rem ipsum dolor sit amet consectetur Lorem ipsum dolor sit amet, consectetur adipisicing elit sed do eiusmod tempor incidi. </p>
					</div>
					<div class="col-md-6 amet-in">
						<h3>Consentur liqua</h3>
						<p>Lorem ipsum dolor sit amet </p>
						<div class="amet-grid">
							<div class="now"><span>Nov</span>2014</div>
							<p class="sed"><span>Lorem ipsum dolor sit amet </span> <span>consecteturLorem ipsum dolor sit</span> <span>amet, consectetur adipisicing</span></p>
						<div class="clearfix"> </div>
						</div>
						<div class="amet-grid">
							<div class="now"><span>Dec</span>2014</div>
							<p class="sed"><span>Lorem ipsum dolor sit amet </span> <span>consecteturLorem ipsum dolor sit</span> <span>amet, consectetur adipisicing</span></p>
						<div class="clearfix"> </div>
						</div>
						<div class="amet-grid">
							<div class="now"><span>Oct</span>2014</div>
							<p class="sed"><span>Lorem ipsum dolor sit amet </span> <span>consecteturLorem ipsum dolor sit</span> <span>amet, consectetur adipisicing</span></p>
						<div class="clearfix"> </div>
						</div>
					</div>
					<div class="clearfix"> </div>
				</div>
			</div>
			<div class="clearfix"> </div>
		</div>
		</div>
	</div>
	<!---->
	<div class="footer">
		<div class="container">
		<div class="col-md-8 footer-bottom ">
		<p class="footer-grid">Copyright &copy; 2015 Food shop Template by  <a href="http://w3layouts.com/" target="_blank">W3layouts</a> </p>

		</div>
				<div class="clearfix"> </div>
		</div>	
	</div>
	<script src="../js/jquery.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <script src="../js/scripts.js"></script>
	 <script type="text/javascript">
						$(document).ready(function() {
							/*
							var defaults = {
					  			containerID: 'toTop', // fading element id
								containerHoverID: 'toTopHover', // fading element hover id
								scrollSpeed: 1200,
								easingType: 'linear' 
					 		};
							*/
							
							$().UItoTop({ easingType: 'easeOutQuart' });
							
						});
					</script>
				<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>

</body>
</html>