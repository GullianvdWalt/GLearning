import Vue from 'vue';

import Vuetify from 'vuetify/lib/framework';
import colors from 'vuetify/lib/util/colors';

Vue.use(Vuetify);

export default new Vuetify({
    theme:{
        themes:{
            light: {
                primary: '#00A3FF',
                secondary: '#716E6E',
                accent: '#C4C4C4',
                error: colors.red.accent3,
                background: '#fff'
            },
            dark: {
                primary: '#00A3FF',
                secondary: '#716E6E',
                accent: '#C4C4C4',
                error: colors.red.accent3,
                background: '#000'
            },
        }
    }
});
