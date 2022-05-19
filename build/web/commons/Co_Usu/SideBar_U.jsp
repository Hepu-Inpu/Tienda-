<div class="w3-sidebar w3-bar-block" style="display:none;z-index:5" id="mySidebar">
  <a href="Datos_Usu.jsp" class="w3-bar-item w3-button">Datos</a>
  <a href="ControladorCar?accion=Carr&menu=mostrar&idU=${Usu.getId()}" class="w3-bar-item w3-button">Productos</a>
</div>

<!-- Overlay -->
<div class="w3-overlay" onclick="w3_close()" style="cursor:pointer" id="myOverlay"></div>

<!-- Page content -->
<button class="w3-button w3-xlarge" onclick="w3_open()">&#9776;</button>
<!-- JS to open and close sidebar with overlay effect -->
<script>
function w3_open() {
  document.getElementById("mySidebar").style.display = "block";
  document.getElementById("myOverlay").style.display = "block";
}

function w3_close() {
  document.getElementById("mySidebar").style.display = "none";
  document.getElementById("myOverlay").style.display = "none";
}
</script>