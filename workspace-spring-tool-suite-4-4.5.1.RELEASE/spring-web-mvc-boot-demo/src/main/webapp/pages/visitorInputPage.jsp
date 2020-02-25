<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<jsp:include page="/header" />
<section style="padding: 10px;min-height:400px;">
	<h2>Visitor Registration</h2>
	<form method="post">
		<label>Name:
			<input type="text" name="firstName" placeholder="firstName" required/>
			<input type="text" name="lastName" placeholder="lastName" required/>
		</label>
		<br />
		<label>DateOfBirth
			<input type="date" name="dateOfBirth" required/>
		</label>
		<br/>
		<button>Register</button>
	</form>
		
</section>
<jsp:include page="/footer" />