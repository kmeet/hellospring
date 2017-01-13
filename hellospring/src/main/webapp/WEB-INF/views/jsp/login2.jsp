<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Reponsive HTML Template</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap -->
<spring:url value="resources/core/css/bootstrap.min.css" var="bootstrapCss"/>
<spring:url value="resources/core/css/style.css" var="styleCss"/>
<link href="${bootstrapCss}" rel="stylesheet">
<link href="${styleCss}" rel="stylesheet">
<link href='http://fonts.googleapis.com/css?family=Arvo:400,700'
	rel='stylesheet' type='text/css'>
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,700,800'
	rel='stylesheet' type='text/css'>

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
        <![endif]-->
</head>
<body>
	<header class="main__header normal">
		<div class="container">
			<nav class="navbar navbar-default" role="navigation">
				<!-- Brand and toggle get grouped for better mobile display -->
				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="menuBar">
					<ul class="menu">
						<li class="active"><a href="index.html">Home</a></li>
						<li class="dropdown"><a href="#">Pages</a>
							<ul>
								<li><a href="index_fixed.html">Home / Fixed</a></li>
								<li><a href="index_with_blog.html">Home + Blog</a></li>
								<li><a href="portfolio.html">Portfolio</a></li>
								<li><a href="typography.html">Typography</a></li>
								<li><a href="shortcodes.html">Shortcodes</a></li>
								<li><a href="store.html">Web Store</a></li>
								<li><a href="blog.html">Blog & News</a></li>
								<li><a href="tables.html">Tables</a></li>
								<li><a href="faq.html">FAQ</a></li>
							</ul></li>
						<li><a href="left_sidebar.html">left sidebar</a></li>
					</ul>
					<ul class="menu m_right">
						<li><a href="right_sidebar.html">right sidebar</a></li>
						<li><a href="full_width.html">full page</a></li>
						<li><a href="contact.html">contact us</a></li>
					</ul>
				</div>
				<div class="navbar-header">
					<h1 class="navbar-brand">
						<a href="index.html">VINUMO</a>
					</h1>
					<a href="#" onClick="javascript.void()" class="submenu">Menus</a>
				</div>
				<!-- /.navbar-collapse -->
			</nav>
		</div>
	</header>
	<section class="main__middle__container">
		<div class="row title__block">
			<div class="container text-center">
				<h2 class="page__title">Contact Us</h2>
				<span class="sep"></span>
				<p class="smaller">Nulla dui. Fusce feugiat malesuada odio.
					Morbi nunc odio, gravida at, cursus nec, luctus a, lorem. Maecenas
					tristique orci ac sem. Duis ultricies pharetra magna. Donec
					accumsan malesuada orci. Donec sit amet eros.</p>
			</div>
		</div>
		<section class="contact-us">
			<div class="container">
				<iframe width="100%" height="350" frameborder="0" scrolling="no"
					marginheight="0" marginwidth="0"
					src="https://maps.google.com/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=&amp;aq=&amp;sll=37.422023,-122.084337&amp;sspn=0.00357,0.008229&amp;ie=UTF8&amp;ll=37.421981,-122.084531&amp;spn=0.001785,0.004115&amp;t=m&amp;z=18&amp;output=embed"></iframe>
				<div class="row">
					<div class="col-md-8">
						<h3>Send us a message</h3>
						<hr>
						<p>Our friendly customer service representatives are committed
							to answering all your questions and meeting any need you may
							have. We would love to hear from you! Please fill out the form
							below so we may assist you.</p>
						<br />
						<p id="feedback"></p>
						<form role="form" id="contact-form" name="contact-form"
							method="post" action="" class="contact-form">
							<div class="form-group col-md-6">
								<label class="sr-only" for="exampleInputEmail1">Your
									Name: *</label> <input required type="text" class="form-control"
									id="name" name="name" placeholder="Your Name: *">
							</div>
							<div class="form-group col-md-6">
								<label class="sr-only" for="exampleInputEmail1">Email: *</label>
								<input required type="email" class="form-control" id="email"
									name="email" placeholder="Email: *">
							</div>
							<div class="clearfix"></div>
							<div class="form-group">
								<label class="sr-only" for="exampleInputEmail1">Subject:</label>
								<input type="text" class="form-control" id="subject"
									name="subject" placeholder="Subject:">
							</div>
							<div class="form-group">
								<textarea required class="form-control" id="message"
									name="message" rows="5" placeholder="Message: *"></textarea>
							</div>
							<input id="submit-button" type="submit"
								class="btn btn-lg btn-info" value="Submit">
						</form>
					</div>
					<div class="col-md-4">
						<h3>Get in touch with us</h3>
						<hr>
						<p>Quisque volutpat mattis eros. Nullam malesuada erat ut
							turpis. Suspendisse urna nibh, viverra non, semper suscipit,
							posuere a, pede.</p>
						<p>Donec nec justo eget felis facilisis fermentum. Aliquam
							porttitor mauris sit amet orci. Aenean dignissim pellentesque
							felis.</p>
						<p class="black-text">
							<span class="orange">Address:</span> 123 Street, Fremont, CA, USA
						</p>
						<p class="black-text">
							<span class="orange">Telephone:</span> 866-123-4555
						</p>
						<p class="black-text">
							<span class="orange">Fax:</span> 866-111-222-3455
						</p>
					</div>
				</div>
			</div>
		</section>
	</section>
	<footer>
		<div class="container">
			<div class="row">
				<div class="col-md-3">
					<h3>About</h3>
					<p>
						We strive to deliver a level of service that exceeds the
						expectations of our customers. <br /> <br /> If you have any
						questions about our products or services, please do not hesitate
						to contact us. We have friendly, knowledgeable representatives
						available seven days a week to assist you.
					</p>
				</div>
				<div class="col-md-3">
					<h3>Tweets</h3>
					<p>
						<span>Tweet</span> <a href="#">@You</a><br /> Etiam egestas,
						ipsum posuere accumsan sollicitudin, nulla mauris volutpat sem,
						sit amet rutrum risus.
					</p>
					<p>
						<span>Tweet</span> <a href="#">@You</a><br /> Quisque porta
						tellus vitae adipiscing molestie. Mauris et lacus blandit,
						malesuada.
					</p>
				</div>
				<div class="col-md-3">
					<h3>Mailing list</h3>
					<p>Subscribe to our mailing list for offers, news updates and
						more!</p>
					<br />
					<form action="#" method="post" class="form-inline" role="form">
						<div class="form-group">
							<label class="sr-only" for="exampleInputEmail2">your
								email</label> <input type="email" class="form-control form-control-lg"
								id="exampleInputEmail2" placeholder="your email">
						</div>
						<button type="submit" class="btn btn-info btn-md">subscribe</button>
					</form>
				</div>
				<div class="col-md-3">
					<h3>Social</h3>
					<p>
						123 Business Way<br /> San Francisco, CA 94108<br /> USA<br />
						<br /> Phone: (888) 123-4567<br /> Fax: (887) 123-4567<br /> <br />
					</p>
					<div class="social__icons">
						<a href="#" class="socialicon socialicon-twitter"></a> <a href="#"
							class="socialicon socialicon-facebook"></a> <a href="#"
							class="socialicon socialicon-google"></a> <a href="#"
							class="socialicon socialicon-mail"></a>
					</div>
				</div>
			</div>
		</div>
	</footer>
	<p class="text-center copyright">&copy; Copyright ABC Company. All
		Rights Reserved.</p>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
	<script type="text/javascript">
            function send_special_order() {
                var data1 = $('#name').val();
                var data2 = $('#subject').val();
                var data3 = $('#email').val();
                var data4 = $('#message').val();
        $.ajax({
			type: "POST",
			url: "send.php",
			dataType : "json",
			data: ( {"name" : data1, "subject" : data2, "email" : data3,"message" : data4} ) ,
			   success: function() {
                               
			   },
                           complete: function(){
                                $('#feedback').append('<p>Thank you for sending us a message. Our specialists will contact you as soon as possible.</p><p>Your message details are:</p>\n\
                                <ul>\n\
                                    <li>Name: <b>' + data1 + '</b></li>\n\
                                    <li>Email: <b>' + data3 + '</b></li>\n\
                                    <li>Subject: <b>' + data2 + '</b></li>\n\
                                    <li>Message: <b>' + data4 + '</b></li>\n\
                                </ul>\n\
                                <p>If you want to change your information press the button:\n\
                                <p><a href="#" id="send-more" class="btn btn-lg btn-info">edit info</a></p>');
                                $('#contact-form').slideUp();
                                $('#send-more').click(function(e){
                                    e.preventDefault()
                                    $('#contact-form').slideDown();
                                    $('#feedback').html('');
                                });
                           }
        });
}
            $('#contact-form').submit(function() {
                send_special_order();
                return false;
            });
        </script>
	<script type="text/javascript">
$( "a.submenu" ).click(function() {
$( ".menuBar" ).slideToggle( "normal", function() {
// Animation complete.
});
});
$( "ul li.dropdown a" ).click(function() {
$( "ul li.dropdown ul" ).slideToggle( "normal", function() {
// Animation complete.
});
$('ul li.dropdown').toggleClass('current');
});
</script>
</body>
</html>