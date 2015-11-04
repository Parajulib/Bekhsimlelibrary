<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">BP Library</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="#about">About</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Book <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#/book/add">Add Book</a></li>
							<li><a href="listBook">List Book</a></li>
							<li><a href="#">Search Book</a></li>
							<!-- <li role="separator" class="divider"></li>
                <li class="dropdown-header">Nav header</li>
                <li><a href="#">Separated link</a></li>
                <li><a href="#">One more separated link</a></li> -->
						</ul></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Author <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="author/add">Add Author</a></li>
							<li><a href="listAuthor">List Author</a></li>
							<li><a href="#">Search Author</a></li>
						</ul></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Genre <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="genre/add">Add Genre </a></li>
							<li><a href="listGenre">List Genre </a></li>
							<li><a href="#">Search Genre </a></li>
						</ul></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Language <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="language/add">Add Language</a></li>
							<li><a href="listLanguage">List Language</a></li>
							<li><a href="#">Search Language</a></li>
						</ul></li>
						<li><a href="#contact">Sign out</a></li>
				</ul>
			</div>
		</div>
	</nav>