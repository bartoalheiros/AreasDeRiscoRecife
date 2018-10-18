import Vue from 'vue'
import axios from 'axios'
import VueAxios from 'vue-axios'
import Router from 'vue-router'
import Sobre from '../components/Sobre'
import Chamados from '../components/Chamados'

Vue.use(VueAxios, axios)
Vue.use(Router)
Vue.use(Sobre)
Vue.use(Chamados)

export default new Router({
	routes: [
		{
			path: '/',
			name: 'Sobre',
			component: Sobre
		},
		{
			path: '/chamados',
			name: 'Chamados',
			component: Chamados
		}
	]
})
