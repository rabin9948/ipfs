<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
  <!-- Site made with Mobirise Website Builder v3.8.3, https://mobirise.com -->
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="generator" content="Mobirise v3.8.3, mobirise.com">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="shortcut icon" href="resources/images/logo.png" type="image/x-icon">
  <meta name="description" content="">
  
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic&amp;subset=latin">
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:400,700">
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i">
  <link rel="stylesheet" href="resources/et-line-font-plugin/style.css">
  <link rel="stylesheet" href="resources/bootstrap-material-design-font/css/material.css">
  <link rel="stylesheet" href="resources/tether/tether.min.css">
  <link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">
  <link rel="stylesheet" href="resources/socicon/css/socicon.min.css">
  <link rel="stylesheet" href="resources/animate.css/animate.min.css">
  <link rel="stylesheet" href="resources/theme/css/style.css">
  <link rel="stylesheet" href="resources/mobirise/css/mbr-additional.css" type="text/css">
  <link rel="stylesheet" href="resources/custom/login.css" type="text/css">
  
  
</head>
<body>
<section class="mbr-section mbr-section-hero mbr-section-full mbr-parallax-background" id="header2-4" style="background-image: url(resources/images/background-2000x1125-36.jpg);">

    <div class="mbr-overlay" style="opacity: 0.4; background-color: rgb(255, 255, 255);">
    </div>

    <div class="mbr-table mbr-table-full">
        <div class="mbr-table-cell">

            <div class="container">
                <div class="mbr-section row">
                    <div class="mbr-table-md-up">
                        <div class="mbr-table-cell mbr-right-padding-md-up col-md-5 text-xs-center text-md-right">

							<div class="form">
							  <div class="tab-content">
								<div id="login">   
								  <h1>Welcome Back!</h1>
								  <form action="/login" method="post">
									<div class="field-wrap">
									<label class="">
									  Your ID<span class="req">*</span>
									</label>
									<input type="ID" name="id" required="" autocomplete="off" autofocus="">
								  </div>
								  <div class="field-wrap">
									<label class="">
									  Password<span class="req">*</span>
									</label>
									<input type="password" name="password" required="" autocomplete="off">
								  </div>
								  <p class="signup"><a href="#" id='signupButton' data-target="#signupModal">Signup Here</a></p>
								  <button class="button button-block">Log In</button>
								  </form>
								</div>	        
							  </div><!-- tab-content -->
							</div>
                        </div>
                        <div class="mbr-table-cell mbr-valign-top col-md-7">
                            <div class="mbr-figure"><img src="resources/images/ipfs-logo-1400x560-58.png"></div>
                        </div>

                    </div>
                </div>
            </div>

        </div>
    </div>

    <div class="mbr-arrow mbr-arrow-floating hidden-sm-down" aria-hidden="true"><a href="#msg-box3-c"><i class="mbr-arrow-icon"></i></a></div>

</section>

<section class="engine"><a rel="external" href="https://mobirise.com">best responsive website design software</a></section><section class="mbr-section" id="msg-box3-c" style="background-color: rgb(242, 242, 242); padding-top: 120px; padding-bottom: 120px;">

    
    <div class="container">
        <div class="row">
            <div class="col-md-8 col-md-offset-2 text-xs-center">
                <h3 class="mbr-section-title display-2">IPFS?</h3>
                <div class="lead"><p>IPFS는 'the InterPlanetary File System'의 줄임말로 '행성간의 파일 시스템'이라는 의미입니다.</p><blockquote><p>IPFS (<a href="https://github.com/ipfs/faq/issues/76" target="_blank">the InterPlanetary File System</a>) is a new hypermedia distribution protocol, addressed by content and identities. IPFS enables the creation of completely distributed applications. It aims to make the web faster, safer, and more open.</p><p>IPFS is a distributed file system that seeks to connect all computing devices with the same system of files. In some ways, this is similar to the original aims of the Web, but IPFS is actually more similar to a single bittorrent swarm exchanging git objects. You can read more about its origins in the paper IPFS - <a href="https://github.com/ipfs/ipfs/blob/master/papers/ipfs-cap2pfs/ipfs-p2p-file-system.pdf?raw=true" target="_blank">Content Addressed, Versioned, P2P File System</a>.</p><p>IPFS is becoming a new major subsystem of the internet. If built right, it could complement or replace HTTP. It could complement or replace even more. It sounds crazy. It is crazy.</p></blockquote></div>
                <div><a class="btn btn-secondary" href="https://ipfs.io/" target="_blank">Go To IPFS.IO</a>   </div>
            </div>
        </div>
    </div>

</section>

<!-- 모달 다이얼로그 -->

<div class="modal fade" id="signupModal" tabindex="-1" role="dialog" aria-labelledby="signupModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="signupModalLabel">Signup!</h4>
      </div>
      <div class="modal-body">
        <form>
          <div class="form-group">
            <input type="text" class="form-control" name="id" id="signup-id" placeholder="ID">
          </div>
          <div class="form-group">
            <input tyep="password" class="form-control" name="password" id="signup-password" placeholder="PASSWORD">
          </div>
          <div class="form-group">
            <input tyep="password" class="form-control" name="password-confirm" id="signup-password-confirm" placeholder="REPEAT PASSWORD">
          </div>
        </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary">Submit</button>
      </div>
    </div>
  </div>
</div>


  <script src="resources/web/assets/jquery/jquery.min.js"></script>
  <script src="resources/tether/tether.min.js"></script>
  <script src="resources/bootstrap/js/bootstrap.min.js"></script>
  <script src="resources/smooth-scroll/SmoothScroll.js"></script>
  <script src="resources/viewportChecker/jquery.viewportchecker.js"></script>
  <script src="resources/jarallax/jarallax.js"></script>
  <script src="resources/theme/js/script.js"></script>
  <script src="resources/custom/login.js"></script>
  
  <script>
  var isCheck = false;
$('#signupModal').on('show.bs.modal', function (event) {
	  var button = $(event.relatedTarget) // Button that triggered the modal
	  // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
	  // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
	  var modal = $(this)
	});
$('#signupButton').on('click', function (event) {
	$('#signupModal').modal('show');
});

$('#signup-id').on('focusout', function (event) {
	$.ajax({
	    url : "/ipfs/member/check-id",
	    dataType : "json",
	    type : "post",
	    headers: { 
	        'Accept': 'application/json',
	        'Content-Type': 'application/json' 
	    },
	    data : JSON.stringify({"id":$(event.target).val()}),
	    success: function(data) {
	        console.log(Object.keys(data));
	    },
	    error:function(request,status,error){
	        alert("code:"+request.status+"\n"+"error:"+error);
	    }
	}); 

});
</script>
  
  
  <input name="animation" type="hidden">
  </body>
</html>