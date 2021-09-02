<template>
  <v-card height="400px">
    <v-footer v-bind="localAttrs" padless>
      <v-card flat tile width="100%" color="accent" class="text-center">
        <v-card-text>
          <v-btn v-for="icon in icons" :key="icon" class="mx-4" icon>
            <v-icon size="24px">
              {{ icon }}
            </v-icon>
          </v-btn>
        </v-card-text>

        <v-divider></v-divider>

        <v-card-text class="white--text">
          {{ new Date().getFullYear() }} — <strong>G-Learning</strong>
        </v-card-text>
      </v-card>
    </v-footer>
  </v-card>
</template>

<script>
export default {
  name: "Footer",
  data: () => ({
    icons: [
      'mdi-home',
      'mdi-email',
      'mdi-calendar',
      'mdi-delete',
    ],
    padless: true,
    variant: 'absolute',
  }),
  computed: {
    localAttrs () {
      const attrs = {};
      attrs[this.variant] = true;
      return attrs;
    },
  },
}
</script>

<style scoped>

</style>