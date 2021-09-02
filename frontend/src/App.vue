<template>
  <v-app>
    <AppBar/>
    <v-main>
      <Home/>
    </v-main>
    <Footer/>
  </v-app>
</template>

<script>
import AppBar from "@/components/AppBar";
import Footer from "@/components/Footer";
import Home from './components/Home';
export default {
  name: 'App',

  components: {
    AppBar,
    Footer,
    Home,
  },

  data: () => ({
    //
  }),
};
</script>
