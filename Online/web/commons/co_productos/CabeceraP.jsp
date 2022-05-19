<nav class="navbar navbar-expand-md bg-dark navbar-dark">
    <!-- Brand -->
    <a class="navbar-brand" href="index.jsp">D-Compras</a>

    <!-- Toggler/collapsibe Button -->
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
        <span class="navbar-toggler-icon"></span>
    </button> 
    <div class="collapse navbar-collapse" id="collapsibleNavbar">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="admin.jsp">Inicio</a>
            </li>

        </ul>
    </div>
    <div class="dropdown dropleft">
        <a class="navbar-brand " data-toggle="dropdown">
            <img src="img/Usr.png" alt="Logo" style="width:45px;">
        </a>
        <div  style=" width:400px;" class="dropdown-menu">
            <center><img src="img/Usr.png"  style="width:200px;"></center>
           <center> <a class="dropdown-divider">${admin.getNombre()}</a></center>
            <div class="dropdown-divider"></div>
            <center> <a class="dropdown-item" href="index.jsp">Cerrar Sesion</a></center>
        </div>
    </div>
</nav>


