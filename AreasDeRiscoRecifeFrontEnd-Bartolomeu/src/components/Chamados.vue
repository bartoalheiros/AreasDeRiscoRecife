<template>
	<div class="chamados">
	  <b-form>
	  	<b-form-row>

	  		<b-col class="form" style="padding-right: 80px">
	  			<label for="inputAno">Ano: </label>
	  			<b-form-input
	  				id="inputAno" 	
	  				type="text"
	  				size="sm" 
	  				style="width: 60px"
	  				v-model="chamado.ano"></b-form-input>
	  	  </b-col>

	  	  <b-col class="form">
	  	  	<label for="inputMes">Mês: </label>
	  	  	<b-form-input
	  	  		id="inputMes" 	
	  	  		type="text"
	  	  		size="sm" 
	  	  		style="width: 101px"
	  	  		v-model="chamado.mes"></b-form-input>
	  	  </b-col>

	  	  <b-col class="form2" style="max-width: 120px">
	  	  	<label for="inputMes">Num. proc: </label>
	  	  	<b-form-input
	  	  		id="inputMes" 	
	  	  		type="text"
	  	  		size="sm" 
	  	  		style="width: 101px"
	  	  		v-model="chamado.processo_numero"></b-form-input>
	  	  </b-col>

	  	   <b-col class="form2" style="max-width: 170px">
	  	  	<label for="inputData">Data. solicit: </label>
	  	  	<b-form-input
	  	  		id="inputMes" 	
	  	  		type="date"
	  	  		v-model="chamado.solicitacao_data"
	  	  		size="sm" style="width: 150px"></b-form-input>
	  	  </b-col>

	  	  <b-col class="form2" style="max-width: 200px">
	  	  	<label for="inputSolictHora">Solict. Horário: </label>
	  	  	<b-form-input
	  	  		id="inputSolictHora"
	  	  		type="text"
	  	  		v-model="chamado.solicitacao_hora"
	  	  		size="sm" style="width: 150px"></b-form-input>
	  	  </b-col>
	  	</b-form-row>

	  	<b-form-row>

	  	  <b-col>
	  	  	<label for="inputSolictDesc">Descrição: </label>
	  	  	<b-form-textarea 
	  	  		id="inputSolictDesc"
	  	  		v-model="chamado.solicitacao_descricao"
	  	  		:rows="4"
	  	  		:max-rows="6"></b-form-textarea>
	  	  </b-col>

	  	</b-form-row>

	  	<b-form-row>

	  		<b-col class="form" style="max-width: 120px">
	  			<label for="inputSolictBairro">Bairro: </label>
	  			<b-form-input 
	  				id="inputSolictBairro"
	  				type="text"
	  				v-model="chamado.solicitacao_bairro"
	  				size="sm" style="width: 100px"></b-form-input>
	  		</b-col>

	  		<b-col class="form" style="max-width: 120px">
	  			<label for="inputSolictLocalidade">Localidade: </label>
	  			<b-form-input
	  				id="inputSolictLocalidade"
	  				type="text"
	  				v-model="chamado.solicitacao_localidade"
	  				size="sm" style="width: 100px"></b-form-input>
	  		</b-col>

	  		<b-col class="form2" style="max-width: 200px">
	  			<label for="inputSolictEndereco">Endereço: </label>
	  			<b-form-input
	  				id="inputSolictEndereco"
	  				type="text"
	  				v-model="chamado.solicitacao_endereco"
	  				size="sm" style="width: 250px"></b-form-input>
	  		</b-col>

	  		 <b-col class="form3">
	  	  	<label id="roteiro" for="inputSolictRoteiro">Roteiro: </label>
	  	  	<b-form-textarea 
	  	  		id="inputSolictRoteiro"
	  	  		v-model="chamado.solicitacao_roteiro"
	  	  		:rows="2"
	  	  		:max-rows="5" style="width: 300px"></b-form-textarea>
	  	  </b-col>

			</b-form-row>

			<b-form-row>
				
				<b-col class="form4" style="max-width: 120px">
					<label for="inputCodRPA">Código RPA: </label>
					<b-form-input
					id="inputCodRPA"
					v-model="chamado.rpa_codigo"
					type="text"
					size="sm" style="width: 50px"></b-form-input>
				</b-col>

				<b-col class="form5" style="max-width: 200px">
					<label for="inputNomeRPA">Nome RPA: </label>
					<b-form-input
					id="inputNomeRPA"
					v-model="chamado.rpa_nome"
					type="text"
					size="sm" style="width: 200px"></b-form-input>
				</b-col>

				<b-col class="form2" style="max-width: 200px">
					<label for="inputMicroregiao">Microregião da Solict: </label>
					<b-form-input
					id="inputMicroregiao"
					v-model="chamado.solicitacao_microrregiao"
					type="text"
					size="sm" style="width: 200px"></b-form-input>
				</b-col>

				<b-col class="form6" style="max-width: 200px">
					<label for="inputPlantao">Plantão: </label>
					<b-form-input
					id="inputPlantao"
					v-model="chamado.solicitacao_plantao"
					type="text"
					size="sm" style="width: 55px"></b-form-input>
				</b-col>

			</b-form-row>

			<b-form-row>
				
				<b-col class="form4" id="formLinha5" style="max-width: 200px">
					<label for="inputOrigChamado">Origem Chamado: </label>
					<b-form-input
					id="inputOrigChamado"
					v-model="chamado.solicitacao_origem_chamado"
					type="text"
					size="sm" style="width: 155px"></b-form-input>
				</b-col>

				<b-col class="form4" id="formLinha5" style="max-width: 200px">
					<label for="inputLatitude">Latitude: </label>
					<b-form-input
					id="inputLatitude"
					v-model="chamado.latitude"
					type="text"
					size="sm" style="width: 155px"></b-form-input>
				</b-col>

				<b-col class="form4" id="formLinha5" style="max-width: 200px">
					<label for="inputLongitude">Longitude: </label>
					<b-form-input
					id="inputLongitude"
					v-model="chamado.longitude"
					type="text"
					size="sm" style="width: 155px"></b-form-input>
				</b-col>

				<b-col class="form4" id="formLinha5" style="max-width: 200px">
					<label for="inputVitimas">Vítimas: </label>
					<b-form-input
					id="inputVitimas"
					v-model="chamado.solicitacao_vitimas"
					type="text"
					size="sm" style="width: 155px"></b-form-input>
				</b-col>

				<b-col class="form4" id="formLinha5" style="max-width: 200px">
					<label for="inputProcessSituac">Situação Proc: </label>
					<b-form-input
					id="inputProcessSituac"
					v-model="chamado.processo_situacao"
					type="text"
					size="sm" style="width: 155px"></b-form-input>
				</b-col>				

			</b-form-row>

			<b-form-row>

				<b-col class="form5" id="formLinha5" style="max-width: 150px">
					<label for="inputProcessTipo">Proc Tipo: </label>
					<b-form-input
					id="inputProcessTipo"
					v-model="chamado.processo_tipo"
					type="text"
					size="sm" style="width: 155px"></b-form-input>		
				</b-col>

				<b-col class="form6" id="formLinha5" style="max-width: 200px">
					<label for="inputProcessOrigem">Proc Origem: </label>
					<b-form-input
					id="inputProcessOrigem"
					v-model="chamado.processo_origem"
					type="text"
					size="sm" style="width: 350px"></b-form-input>		
				</b-col>

				<b-col class="form7" id="formLinha5" style="max-width: 200px">
					<label for="inputProcessLicalizac" id="labelProcLocalizc">Proc Localização: </label>
					<b-form-input
					id="inputProcessLocalizac"
					v-model="chamado.processo_localizacao"
					type="text"
					size="sm" style="width: 350px"></b-form-input>		
				</b-col>

			</b-form-row>

			<b-form-row>

				<b-col class="form5" id="formLinha5" style="max-width: 200px">
					<label for="inputProcessStatus" id="labelProcLocalizc">Proc Status: </label>
					<b-form-input
					id="inputProcessStatus"
					v-model="chamado.processo_status"
					type="text"
					size="sm" style="width: 250px"></b-form-input>		
				</b-col>

				<b-col class="form3" id="formLinha5" style="max-width: 200px">
					<label for="inputProcDtConcl" id="labelProcDtaConc">Proc. Dta. Conclusão: </label>
					<b-form-input
					id="inputProcDtConcl"
					type="text"
					v-model="chamado.processo_data_conclusao"
					size="sm" style="width: 250px"></b-form-input>		
				</b-col>

			</b-form-row>

			<b-form-row>

				<b-col class="form7" id="btnAdicionar" style="max-width: 140px">
					<label for="btnAdicionar" id="labelBtnAdicionar"></label>
					<b-button variant="info">Adicionar</b-button>
				</b-col>

				<b-col class="form" id="btnAtt" style="max-width: 140px">
					<label for="btnAtualizar" id="labelBtnAtt"></label>
					<b-button variant="info">Atualizar</b-button>
				</b-col>

					<b-col class="form" id="btn" style="max-width: 300px">
					<label for="btnAtualizar" id="labelBtnRemover"></label>
					<b-button variant="info">Remover</b-button>

				</b-col>				

			</b-form-row>

			<b-form-row>
				
				<b-col class="form5" id="formLinha5" style="max-width: 300px">
					<label for="inputProcDtConcl" id="labelProcDtaConc"></label>
					<b-input-group size="sm" class="mb-3" style="width: 400px">
						<b-form-input style="width: 300px" placeholder="Digite o número do processo" v-model="id"/>
						<b-input-group-append>
							<b-btn size="sm" text="Button" variant="info" v-on:click="buscar">Pesquisar</b-btn>
						</b-input-group-append>
					</b-input-group>
				</b-col>

			</b-form-row>

	  </b-form>
	</div>	
</template>

<script>

import axios from 'axios'

export default {

	name:'chamados',
	data () {
		return {
			tituloTabela: "Lista de Chamados",
			chamado: {},
			id: null
		}
	},
	methods: {

		buscar: function() {
			var data = this;
			axios.get('http://localhost:5000/chamados/get/' + this.id)
				.then(function (response) {
    			// handle success
    			data.chamado = response.data;
    			console.log(data.chamado)
    			//console.log(response.data);
  			})
				.catch(function (error) {
    		// handle error

    			alert('Chamado não encontrado.')
    		
    			console.log(error);
    		})
				.then(function () {
    		// always executed
  		});

		}

	}	
}

</script>

<style scoped>
	
	.form {
		max-width: 80px;
		padding-right: 100px;
	}

	.form2 {
		padding-left: 20px;
	}

	.form3 {
		padding-left: 100px;
	}

	.form4 {
		padding-right: 20px;
		column-width: 100px; 
	}

	.form5 {
		padding-left: 5px;
	}

	.form6 {
		padding-left: 36px;
	}

	.form7 {
		padding-left: 200px;
	}

	#btn {
		padding-top: 20px;
		padding-left: 2px;
	}

	#btnAdicionar {
		padding-top: 20px;
		padding-left: 0px;
		padding-right: 0px;
	}

	#btnAtt {
		padding-top: 20px;
		padding-left: 0px;
		padding-right: 10px;
	}

	#formLinha5 {
		padding-top: 20px;
	}

	#labelProcLocalizc {
		width: 120px;
	}

	#labelProcDtaConc {
		width: 150px;
	}

</style>
