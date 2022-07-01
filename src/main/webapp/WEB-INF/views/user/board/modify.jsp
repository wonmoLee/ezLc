<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>ELUN</title>
	<link rel="shortcut icon" href="/resources/img/ez-logo.ico">
    <!-- Custom fonts for this template -->
    <link href="/resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="/resources/css/sb-admin-2.min.css" rel="stylesheet">
    <!-- Custom styles for this page -->
    <link href="/resources/vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">
</head>
<body id="page-top">
    <!-- Page Wrapper -->
    <div id="wrapper">
    
    	<!-- Sidebar -->
    	<%@ include file="../../include/nav.jsp" %>
		<!-- End of Sidebar -->

        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">

			<div class="container-fluid">

	            <!-- Main Content -->
	            <div class="row" style="margin-top: 30px;">
	           		<div class="col-lg-12">
	           			<h1 class="h3 mb-2 text-gray-800" style="margin-left: 7px;">글 수정</h1>
	           		</div> 
	            </div>
	            
	            <div>
	            	<div class="col-lg-12">
	            		<div class="panel panel-default">
	            			<form role="form" action="/board/modifyAction" method="post">
	            				<button type="submit" class="btn btn-primary" style="margin-top: 30px;">수정</button>
	            				
	            				<input class="form-control" type="hidden" name="BNO" value='<c:out value="${board.BNO}"/>' required>
	            			
	            				<div class="form-group">
	            					<label>제목</label>
	            					<input class="form-control" name="TITLE" value='<c:out value="${board.TITLE}"/>' required>
	            				</div>
	            				
	            				<div class="form-group">
	            					<label>내용</label>
	            					<textarea class="form-control" rows="22" name="CONTENT" required><c:out value="${board.CONTENT}"/></textarea>
	            				</div>
	            				
	            				<div class="form-group">
	            					<label>수정자</label>
	            					<input class="form-control" name="MOD_ID" value='<c:out value="${board.MOD_ID}"/>' readonly="readonly">
	            				</div>
	            			</form>
	            		</div>
	            	</div>
	            </div>
            <!-- End of Main Content -->
            
            </div>

            <!-- Footer -->
            <%@ include file="../../include/footer.jsp" %>
            <!-- End of Footer -->

        </div>
        <!-- End of Content Wrapper -->

    </div>
    <!-- End of Page Wrapper -->
</body>
</html>