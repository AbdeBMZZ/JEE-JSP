<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Test</title>
    </head>
    <body>
        <p>Ceci est une page générée depuis une JSP.</p>
        <p>
            <% String attribut = (String) request.getAttribute("test"); %>
            <%= attribut %>

            <% String parametre = request.getParameter( "auteur" ); %>
        </p>
        <p>
            Récupération du bean :
            <jsp:useBean id="coyote" class="com.boumaiza.beans.Coyote" scope="request" />
            <jsp:getProperty name="coyote" property="prenom" />
            <jsp:getProperty name="coyote" property="nom" />
        </p>
    </body>
</html>
