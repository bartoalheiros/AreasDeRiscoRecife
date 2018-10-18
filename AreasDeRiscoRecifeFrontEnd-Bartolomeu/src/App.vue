<template>
  <div id="app">
   <b-row>
    <b-col class="barraLateral">
     <b-nav vertical class="w-25">
      <label for="sobre"></label><b-nav-item href="#/" class="itemLista" id="sobre"><p id="itensLista">Sobre</p></b-nav-item>
      <b-nav-item href="#/chamados" class="itemLista" id="chamados"><p id="itensLista">Chamados</p></b-nav-item>
     </b-nav>
    </b-col>
    <div class="painel">
      <router-view></router-view>
    </div>
   </b-row>
  </div>
</template>

<script>
export default {
  name: 'app'
}
</script>

<style>

.a {
  padding-left: -7px;
}

#itensLista {
  color: white;
  width: 300px;
  height: 60px;
  padding-left: -7px;
  margin-left: -13px;
  border-left: 0px;
  text-align: left;
  margin-bottom: 0px;
}

#itensLista:hover {
  color: white;
  background-color: #373e5e;
  width: 280px;
}

.barraLateral {
  height: 300px;
  max-width: 300px;
  padding-right: 0px; 
  background-color: blue;
}

.itemLista {
  width: 300px;
  color: #ffff; /* Não funciona */
  font-weight: bold;
}

.painel {
  height: 1200px;
  column-width: 800px;
  padding-left: 40px;
  padding-top: 20px;
}

.p {
  height: 100px;
}

</style>