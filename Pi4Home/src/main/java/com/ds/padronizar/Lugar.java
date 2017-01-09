package com.ds.padronizar;

public enum Lugar {
	Sala {
		@Override
		public String toString() {
			return "Sala da TV";
		}
	},
	PortaEntrada {
		@Override
		public String toString() {
			return "Porta da entrada da casa";
		}
	},
	Corredor {
		@Override
		public String toString() {
			return "Corredor";
		}
	},
	Escritorio {
		@Override
		public String toString() {
			return "Escritório";
		}
	},
	Cozinha {
		@Override
		public String toString() {
			return "Cozinha";
		}
	},
	QuartoGui {
		@Override
		public String toString() {
			return "Quarto do Gui";
		}
	},
	QuartoMeu {
		@Override
		public String toString() {
			return "Meu quarto";
		}
	}

}