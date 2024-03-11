<template>
  <div class="app">
    <router-view>
    </router-view>
  </div>
</template>

<script>
import Header from "./components/layout/Header.vue";
import Home from "./views/Home.vue";


export default {
  components:{ Home, Header}
}
</script>

<style scoped>
  .app {
    /* background-color: lightblue; */
    width:1024px;
    min-height: 100vh;
  }

  
  router-link {
    color:black;
  }
</style>


<!-- <style scoped>
  .search_Wrapper {
  
   height: 30px;
   width:410px;
   border: 1px solid black;
   display: flex;
   justify-content: center;
  }
  .search_wrap {
    display:flex;
  }

  .search {
    width: 350px;
    height: 25px;
    margin:2px 2px 2px 2px;
  }
  .search_Img {
    margin:1px 1px 1px 1px;
  }

  header {
  position: fixed;
  top: 0; left: 0;
  height: 100px;
  width: 100%;
  background-color: gray;
}

  footer {
  position: fixed;
  bottom: 0; left: 0;
  height: 100px;
  width: 100%;
  background-color: gray;
}

</style> -->

