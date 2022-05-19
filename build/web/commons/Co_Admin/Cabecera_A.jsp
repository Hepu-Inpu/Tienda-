<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.2/font/bootstrap-icons.css">
<nav class="navbar navbar-expand-sm navbar-light sticky-top" style="background: #6AFB92">
    <!-- Brand -->
    <a class="navbar-brand active h5" href="index.jsp">Tienda V</b></a>
    
    
<!--%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%      BOTONES INICIO Y PRODUCTOS         %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%-->
    <div class="collapse navbar-collapse" id="collapsibleNavbar">
        <ul class="navbar-nav">
            <li class="nav-item active">
                <a class="nav-link h6" href="IndexA.jsp">Inicio</a> 
            </li>
        </ul>
    </div>

<!--%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%          DROPDOWN         %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%  -->
    <div class="dropdown dropleft" style="cursor:pointer;">
        <a class="navbar-brand " data-toggle="dropdown">
            <svg xmlns="http://www.w3.org/2000/svg" width="29" height="29" fill="currentColor" class="bi bi-person-circle" viewBox="0 0 16 16">
                <path d="M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0z"/>
                <path fill-rule="evenodd" d="M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8zm8-7a7 7 0 0 0-5.468 11.37C3.242 11.226 4.805 10 8 10s4.757 1.225 5.468 2.37A7 7 0 0 0 8 1z"/>
            </svg>
        </a>
        <div  style=" width:200px;" class="dropdown-menu">
            <center><img src="img/PFL.png"  style="width:100px;"></center>
            <center><a>${admin.getNombres()}</a></center>
            <div class="dropdown-divider"></div>
            <center><a class="dropdown-item" href="index.jsp">Cerrar Sesion</a></center>
        </div>
    </div>
</nav>


