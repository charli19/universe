<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Identification form</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
    </head>
    <body>
        <div class="container">
            <ol class="breadcrumb">
                <li><a href="<c:url value="/home.htm" />">Home</a></li>
                <li class="active">Identification form</li>
            </ol>
            <div class="panel panel-primary">
                <div class="panel-heading" style="text-align: center">IDENTIFICATION FORM</div>
                <div class="panel-body">
                        <form:form method="post" commandName="persons">
                            <form:errors path="*" element="div" cssClass="alert alert-danger" />
                            
                            <div class="col-md-1">
                                <form:label path="name" style="margin-top: 6px">Rebeld </form:label>
                                </div>
                                <div class="col-md-3">
                                <form:input placeholder="Name to rebeld" path="name" cssClass="form-control" />
                            </div>
                            
                            <div class="col-md-1">
                                <form:label path="planet" style="margin-top: 6px">on </form:label>
                                </div>
                                <div class="col-md-3">
                                <form:select path="planet" cssClass="form-control">
                                    <form:option value="0">Select your planet</form:option>
                                    <form:options items="${planetList}" />
                                </form:select>
                            </div>
                            
                            <div class="col-md-1">
                                <form:label path="register" style="margin-top: 6px">at </form:label>
                                </div>
                                <div class="col-md-3">
                                <form:input type="date" path="register" cssClass="form-control" />
                            </div>
                            <br><br>
                            <hr>
                            <div style="float: left; display: flex; margin-left: 15px;">
                                <a href="<c:url value="home.htm" />" class="btn btn-danger">Back</a>
                            </div>
                            <input style="float: right; margin-right: 15px" type="submit" value="Submit" class="btn btn-success" />
                        </form:form>
                </div>
            </div>
        </div>
    </body>
</html>
