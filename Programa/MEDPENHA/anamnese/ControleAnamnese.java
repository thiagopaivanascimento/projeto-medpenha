package anamnese;

import javax.swing.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.util.Date;

import dao.*;

public class ControleAnamnese implements ActionListener,MouseListener {

	  private JFrame telaAnamnese;
	  
	     public ControleAnamnese(JFrame telaAnamnese)
	   {
		   this.telaAnamnese=telaAnamnese;
	   }
	    
	    public void actionPerformed(ActionEvent evt)
		{
	      	JPanel pcampo=(JPanel)telaAnamnese.getContentPane().getComponent(1);
	    	JPanel pimc=(JPanel)pcampo.getComponent(0);
	    	JPanel psangue=(JPanel)pcampo.getComponent(1);
	    	JPanel pVicios=(JPanel)pcampo.getComponent(3);
	    	JPanel pdoenca=(JPanel)pcampo.getComponent(4);
	    	JPanel pdados=(JPanel)pcampo.getComponent(5);
	    	JPanel pIdentPaciente=(JPanel)pcampo.getComponent(6);
	    	
	    	JTextField tReligiao=(JTextField)pdados.getComponent(3);
	    	JTextField tProfissao=(JTextField)pdados.getComponent(4);
	    	JComboBox cbSexo=(JComboBox)pdados.getComponent(8);
	    	JTextField tRaca=(JTextField)pdados.getComponent(11);
	    	JTextField tNasc=(JTextField)pdados.getComponent(14);
	    	JTextField tPraticaEsporte=(JTextField)pdados.getComponent(16);
	    	
	    	JTextField tAlergia=(JTextField)pdoenca.getComponent(4);
	    	JTextField tDoenca=(JTextField)pdoenca.getComponent(5);
	    	JTextField tMedicamento=(JTextField)pdoenca.getComponent(6);
	    	JTextField tDoencaFamilia=(JTextField)pdoenca.getComponent(7);
	    	
	    	JTextField tPeso=(JTextField)pimc.getComponent(1);
	    	JTextField tAltura=(JTextField)pimc.getComponent(5);
	    	JTextField tImc=(JTextField)pimc.getComponent(8);
	    	JButton btnCalular=(JButton)pimc.getComponent(11);
	    	
	    	JTextField tNome=(JTextField)pIdentPaciente.getComponent(1);
	    	JTextField tMatricula=(JTextField)pIdentPaciente.getComponent(4);
	    	JTextField tDataAnamnese=(JTextField)pIdentPaciente.getComponent(7);
	    	
	    	JTextField tQtdEtilista=(JTextField)pVicios.getComponent(4);
	    	JComboBox cbEtilista=(JComboBox)pVicios.getComponent(1);
	    	JTextField tQtdTabagista=(JTextField)pVicios.getComponent(9);
	    	JComboBox cbTabagista=(JComboBox)pVicios.getComponent(6);
	    	
	    	JTextField tTipoSang=(JTextField)psangue.getComponent(1);
	    	JTextField tPressao=(JTextField)psangue.getComponent(4);
	    	JTextField tFreqCardiaca=(JTextField)psangue.getComponent(8);
	    		    	 	
	    	 Anamnese anamnese = new Anamnese();
	         DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
	         DaoAnamnese dao= df.getDaoAnamnese();
	         
	            anamnese.setReligiao(tReligiao.getText());
	            anamnese.setProfissao(tProfissao.getText());
	            int index=cbSexo.getSelectedIndex();
	            anamnese.setSexo((String)cbSexo.getItemAt(index)); 
	            anamnese.setRaca(tRaca.getText());
	            anamnese.setDataNasc(tNasc.getText());
	            anamnese.setPratEsporte(tPraticaEsporte.getText());
		    	
	            anamnese.setAlergia(tAlergia.getText());
	            anamnese.setDoencas(tDoenca.getText());
	            anamnese.setMedicamentos(tMedicamento.getText());
	            anamnese.setDoencaFamilia(tDoencaFamilia.getText());
	        	           
	            anamnese.setNome(tNome.getText());
	            anamnese.setData(tDataAnamnese.getText());
		    	anamnese.setQtdEtilismo(tQtdEtilista.getText());
	            
	            int index1=cbEtilista.getSelectedIndex();
	            anamnese.setEtilista((String)cbEtilista.getItemAt(index1)); 
	            	                      	            
	            int index2=cbTabagista.getSelectedIndex();
	            anamnese.setTabagista((String)cbTabagista.getItemAt(index2)); 
	          		    	
	            anamnese.setTipoSanguineo(tTipoSang.getText());
	            anamnese.setPressao(tPressao.getText());
	           	          		
	            if(tMatricula.getText().equals(""))
	            {}
	            else
	            {
	            	int matricula = Integer.parseInt(tMatricula.getText());	
	            	anamnese.setMatricula(matricula);
	            }
	            
   
	            tNome.setEnabled(false);
	            cbSexo.setEnabled(false);
	            tNasc.setEnabled(false);
	            tImc.setEnabled(false);
	            tMatricula.setEnabled(true);
	            
	            if(evt.getActionCommand().equals("Voltar"))
	       		{ 	       	  
	            	telaAnamnese.dispose();
	       		}  
	            
	            if(evt.getActionCommand().equals("Limpar"))
	       		{ 	       	  
	            	 tReligiao.setText("");
			         tProfissao.setText("");
			         cbSexo.setSelectedItem("Selecione o Sexo");
			         tRaca.setText("");
			         tNasc.setText("");
			         tPraticaEsporte.setText("");
				     tAlergia.setText("");
			         tDoenca.setText("");
			         tMedicamento.setText("");
			         tDoencaFamilia.setText("");
				     tPeso.setText("");
			         tAltura.setText("");
			         tImc.setText("");
				     tNome.setText("");
			         tMatricula.setText("");
			         tDataAnamnese.setText("");
				     tQtdEtilista.setText("");
			         cbEtilista.setSelectedItem("Selecione uma opção");
			         tQtdTabagista.setText("");
			         cbTabagista.setSelectedItem("Selecione uma opção");
			         tTipoSang.setText("");
			         tPressao.setText("");
			         tFreqCardiaca.setText("");
	       		}  
	            
	            if(evt.getActionCommand().equals("Calcular"))
	       		{ 	  
	            	if(tPeso.getText().equals(""))
	            	{
	            		JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Peso!","Atenção",JOptionPane.WARNING_MESSAGE);  
	            	}
	            	else if((tAltura.getText().equals("_.__"))||(tAltura.getText().equals("")))
	            	{
	            		JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Altura!","Atenção",JOptionPane.WARNING_MESSAGE); 
	            	}
	            	else
	            		{	     	
	            			
	            			try{
	            			        
	            				double peso = Double.parseDouble(tPeso.getText());	
	        	            	anamnese.setPeso(peso);
	        	            	double altura = Double.parseDouble(tAltura.getText());	
	        	            	anamnese.setAltura(altura);
	        	            	
	            					altura=altura*altura;
	            					double total =peso/altura;
	            	
	            					total=Math.round(total);
	            					tImc.setText(String.valueOf(total));
	            					
	            					double imc = Double.parseDouble(tImc.getText());	
		        	            	anamnese.setImc(imc);
	            					tMatricula.setEnabled(false);
	            			}
	            			catch(Exception e)
	            			{
	            				tMatricula.setEnabled(false);
	            				JOptionPane.showMessageDialog(null,"Altura ou Peso inválidos!","Erro",JOptionPane.ERROR_MESSAGE);  
	            			 }
	            		}  
	       		}  
	            
	            if(evt.getActionCommand().equals("Buscar Paciente"))
	       		{ 	   
	            	if(tMatricula.getText().equals(""))
	            	{
	            		JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Matrícula!","Atenção",JOptionPane.WARNING_MESSAGE);
	            	}
	            	else{
	            		try{
	            			int matricula = Integer.parseInt(tMatricula.getText());	
	            			anamnese.setMatricula(matricula);
	            	
	            			boolean aux=dao.buscarPaciente(anamnese);
	            			if(aux==false)
	            			{
	            				JOptionPane.showMessageDialog(null,"Paciente não cadastrado no sistema, por favor verifique a matrícula!","Atenção",JOptionPane.WARNING_MESSAGE); 
	            			}
	            			else
	            			{
	            				tNome.setText(anamnese.getNome());
           			 			tMatricula.setText(String.valueOf(anamnese.getMatricula()));
           			 			tNasc.setText(anamnese.getDataNasc());
           			 			cbSexo.setSelectedItem(anamnese.getSexo());
           			 			tMatricula.setEnabled(false);
           		     	
	            			} 
	            		}
	            	   	catch(Exception e)
	            	   	{
	            	   		JOptionPane.showMessageDialog(null,"Matrícula inválida!","Erro",JOptionPane.ERROR_MESSAGE);  
	            	   	}
	            	}
	       		}
	            if(evt.getActionCommand().equals("Salvar"))
	       		{ 	       	
	            	tMatricula.setEnabled(false);	            	            	
        			
	            	if((tNome.getText().equals(""))||(tMatricula.getText().equals(""))||(cbSexo.getSelectedItem().equals("Selecione o Sexo"))
	            	||(tNasc.getText().equals("__/__/____")))
	            	{
	            		 JOptionPane.showMessageDialog(null,"Você precisa buscar o paciente, antes de cadastar a anamnese!","Atenção",JOptionPane.WARNING_MESSAGE);
	            		 tMatricula.setEnabled(true);	
	            	}
	            		            	        			
	            	else if((tDataAnamnese.getText().equals(""))||(tDataAnamnese.getText().equals("__/__/____")))
	            	{
	            		 JOptionPane.showMessageDialog(null,"Você precisa clicar no campo Data!","Atenção",JOptionPane.WARNING_MESSAGE);
	            	}
	            	else if(tProfissao.getText().equals(""))
	            	{
	            		 JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Profissão!","Atenção",JOptionPane.WARNING_MESSAGE);
	            	}
	            	else if(tRaca.getText().equals(""))
	            	{
	            		 JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Raça!","Atenção",JOptionPane.WARNING_MESSAGE);
	            	}
	            	else if(tReligiao.getText().equals(""))
	            	{
	            		JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Religião!","Atenção",JOptionPane.WARNING_MESSAGE);
	            	}
	            	else if(tPraticaEsporte.getText().equals(""))
	            	{
	            		JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Pratica Esporte!","Atenção",JOptionPane.WARNING_MESSAGE);
	            	}
	            	else if(tDoenca.getText().equals(""))
	            	{
	            		JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Doença(s)!","Atenção",JOptionPane.WARNING_MESSAGE);
	            	}
	            	else if(tMedicamento.getText().equals(""))
	            	{
	            		JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Medicamento(s)!","Atenção",JOptionPane.WARNING_MESSAGE);
	            	}
	            	else if(tDoencaFamilia.getText().equals(""))
	            	{
	            		JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Doença(s) na Família!","Atenção",JOptionPane.WARNING_MESSAGE);
	            	}
	            	else if(tAlergia.getText().equals(""))
	            	{
	            		JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Alergia(s)!","Atenção",JOptionPane.WARNING_MESSAGE);
	            	}
	            	else if(cbEtilista.getSelectedItem().equals("Selecione uma opção"))
	            	{
	            		JOptionPane.showMessageDialog(null,"Você precisa selecionar se é ou não etilista!","Atenção",JOptionPane.WARNING_MESSAGE);
	            	}
	            	else if(cbTabagista.getSelectedItem().equals("Selecione uma opção"))
	            	{
	            		JOptionPane.showMessageDialog(null,"Você precisa selecionar se é ou não tabagista!","Atenção",JOptionPane.WARNING_MESSAGE);
	            	}	            	     	
	            	else if(tPeso.getText().equals(""))
	            	{
	            		JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Peso!","Atenção",JOptionPane.WARNING_MESSAGE);
	            	}
	            	else if((tAltura.getText().equals("_.__"))||(tAltura.getText().equals("")))
	            	{
	            		JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Altura!","Atenção",JOptionPane.WARNING_MESSAGE);
	            	}
	            	else if(tImc.getText().equals(""))
	            	{
	            		JOptionPane.showMessageDialog(null,"Você precisa precionar o botão calcular, para calcular o Imc!","Atenção",JOptionPane.WARNING_MESSAGE);
	            	}
	            	else if(tTipoSang.getText().equals(""))
	            	{
	            		JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Tipo Sanguíneo!","Atenção",JOptionPane.WARNING_MESSAGE);
	            	}
	            	else if(tPressao.getText().equals("__/__"))
	            	{
	            		JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Pressão!","Atenção",JOptionPane.WARNING_MESSAGE);
	            	}
	            	else if(tFreqCardiaca.getText().equals(""))
	            	{
	            		JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Frequência Cardíaca!","Atenção",JOptionPane.WARNING_MESSAGE);
	            	}
	            	else
	            	{
	            		boolean aux=dao.visualizar(anamnese);
	            	
	           		 	if(aux==true)
	           		 	{	
	           		 		JOptionPane.showMessageDialog(null,"Anamnese já cadastrada no sistema","Atenção",JOptionPane.WARNING_MESSAGE);
	           		 	}
	           		 	else
	           		 	{
	           		 	boolean aux1=dao.buscarPaciente(anamnese);
	              		
						if(aux1==false)
	              		 {
	              			 JOptionPane.showMessageDialog(null,"Paciente não cadastrado no sistema, por favor verifique a matrícula e faça uma nova busca do paciente!","Atenção",JOptionPane.WARNING_MESSAGE); 
	              		 }
	              		 else
	              		 {
	              			try{    			 
	              			if (tQtdTabagista.getText().equals(""))
	              		 	{}
	              		 	else{
	              		 		
	              		 				int qtdcigarros = Integer.parseInt(tQtdTabagista.getText());	
	              		 				anamnese.setQtdCigarros(qtdcigarros);
	              		 		} 		 	
	              		
	              		 			 if(tImc.getText().equals(""))
	              		            {}
	              		            else
	              		            {
	              		            	double imc = Double.parseDouble(tImc.getText());	
	              		            	anamnese.setImc(imc);
	              		            }
	              		            

	              		            if(tAltura.getText().equals(""))
	              		            {}
	              		            else
	              		            {
	              		            	 double altura = Double.parseDouble(tAltura.getText());	
	              		             	anamnese.setAltura(altura);
	              		            }
	              		            
	              		            if(tPeso.getText().equals(""))
	              		            {}
	              		            else
	              		            {
	              		            	double peso = Double.parseDouble(tPeso.getText());	
	              		            	anamnese.setPeso(peso);
	              		            }
	              	            	
	              		 				
	              		 				
	              		 			try{
	              		 			int freqcardiaca = Integer.parseInt(tFreqCardiaca.getText());	
	              		 			anamnese.setfreqCardiaca(freqcardiaca);
		              		        		            			          
	              		 		              		 			
        			            	dao.adicionar(anamnese);
	            			          
	            			         tReligiao.setText("");
	            			         tProfissao.setText("");
	            			         cbSexo.setSelectedItem("Selecione o Sexo");
	            			         tRaca.setText("");
	            			         tNasc.setText("");
	            			         tPraticaEsporte.setText("");
	            				     tAlergia.setText("");
	            			         tDoenca.setText("");
	            			         tMedicamento.setText("");
	            			         tDoencaFamilia.setText("");
	            				     tPeso.setText("");
	            			         tAltura.setText("");
	            			         tImc.setText("");
	            				     tNome.setText("");
	            			         tMatricula.setText("");
	            			         tMatricula.setEnabled(true);	
	            			         tDataAnamnese.setText("");
	            				     tQtdEtilista.setText("");
	            			         cbEtilista.setSelectedItem("Selecione uma opção");
	            			         tQtdTabagista.setText("");
	            			         cbTabagista.setSelectedItem("Selecione uma opção");
	            			         tTipoSang.setText("");
	            			         tPressao.setText("");
	            			         tFreqCardiaca.setText("");
	            			         JOptionPane.showMessageDialog(null,"Anamnese cadastrada com sucesso!","Dados salvos",JOptionPane.INFORMATION_MESSAGE);
	              		 	
	              		 			}
	              		 			catch(Exception e)
	              		 			{
	              		 				JOptionPane.showMessageDialog(null,"Freqüência cardíaca inválida!","Erro",JOptionPane.ERROR_MESSAGE);
	              		 			}
	              		 		
	              		 		}
	              		 		
	              		 		catch(Exception e)
	              		 		{
	              		 		JOptionPane.showMessageDialog(null,"Quantidade de cigarros inválida!","Erro",JOptionPane.ERROR_MESSAGE);
	              		    	}
	              		 		
	              		 	
	              		 }
	           		  }
	               }
	       		}      	    
	            
	            if(evt.getActionCommand().equals("Consultar"))
	        	{ 
	           	 if(tMatricula.getText().equals(""))
	                    {
	            	      JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Matrícula!","Atenção",JOptionPane.WARNING_MESSAGE);
	                    }
	           	 else{
	           		 
	           		try{
		            	int matricula = Integer.parseInt(tMatricula.getText());	
			            anamnese.setMatricula(matricula);
	           		 	boolean aux=dao.visualizar(anamnese);
	           		 	
	           		 	if(aux==false)
	    	    				{	
	           		 				JOptionPane.showMessageDialog(null,"Anamnese não cadastrada no sistema","Atenção",JOptionPane.WARNING_MESSAGE);
	    	    				}
	           		 		else
	           		 			{
	           		 				tReligiao.setText(anamnese.getReligiao());
	           		 				tProfissao.setText(anamnese.getProfissao());
	           		 				cbSexo.setSelectedItem(anamnese.getSexo());
	           		 				cbSexo.setEnabled(false);
	           		 				tRaca.setText(anamnese.getRaca());
	           		 				tNasc.setText(anamnese.getDataNasc());
	           		 				tNasc.setEnabled(false);
	           		 				tPraticaEsporte.setText(anamnese.getPratEsporte());
           			            	tAlergia.setText(anamnese.getAlergia());
           			            	tDoenca.setText(anamnese.getDoencas());
           			            	tMedicamento.setText(anamnese.getMedicamentos());
           			            	tDoencaFamilia.setText(anamnese.getDoencaFamilia());
           			            	tPeso.setText(String.valueOf(anamnese.getPeso()));
           			            	tAltura.setText(String.valueOf(anamnese.getAltura()));
           			            	tImc.setText(String.valueOf(anamnese.getImc()));
           			            	tNome.setText(anamnese.getNome());
           			            	tNome.setEnabled(false);
           			            	tMatricula.setText(String.valueOf(anamnese.getMatricula()));
           			            	tMatricula.setEnabled(false);
           			            	tDataAnamnese.setText(anamnese.getData());
           			            	tQtdEtilista.setText(anamnese.getQtdEtilismo());
           			            	cbEtilista.setSelectedItem(anamnese.getEtilista());
           			            	tQtdTabagista.setText(String.valueOf(anamnese.getQtdCigarros()));
           			            	cbTabagista.setSelectedItem(anamnese.getTabagista());
           			            	tTipoSang.setText(anamnese.getTipoSanguineo());
           			            	tPressao.setText(anamnese.getPressao());
           			            	tFreqCardiaca.setText(String.valueOf(anamnese.getfreqCardiaca()));
           			          
           			            	
	           		 		}
	           		}
	    	            	catch(Exception e)
	    	            	{
	    	            		JOptionPane.showMessageDialog(null,"Matrícula inválida!","Erro",JOptionPane.ERROR_MESSAGE);  
	    	            	}	  
	    				 }
	           	    }
	            
	            
	            if(evt.getActionCommand().equals("Alterar"))
	    	 	{	  
	            	tMatricula.setEnabled(false);
	            	int matricula = Integer.parseInt(tMatricula.getText());	
        			anamnese.setMatricula(matricula);
        			
        			double imc = Double.parseDouble(tImc.getText());	
	            	anamnese.setImc(imc);
	            	double altura = Double.parseDouble(tAltura.getText());	
	            	anamnese.setAltura(altura);
        			
	               if((tNome.getText().equals(""))||(tMatricula.getText().equals(""))||(tDataAnamnese.getText().equals(""))
	        	   ||(tProfissao.getText().equals(""))||(cbSexo.getSelectedItem().equals("Selecione o Sexo"))||(tRaca.getText().equals(""))
	        	   ||(tReligiao.getText().equals(""))||(tNasc.getText().equals("__/__/____"))||(tPraticaEsporte.getText().equals(""))
	               ||(tDoenca.getText().equals(""))||(tMedicamento.getText().equals(""))||(tDoencaFamilia.getText().equals(""))
	               ||(tAlergia.getText().equals(""))||(tPeso.getText().equals(""))||((tAltura.getText().equals("_.__"))||(tAltura.getText().equals("")))
	               ||(tImc.getText().equals(""))||(tTipoSang.getText().equals(""))||(tPressao.getText().equals("__/__"))||(tFreqCardiaca.getText().equals("")))

	        	   {
	          	      JOptionPane.showMessageDialog(null,"Você precisa Fazer uma consulta pela Matrícula, para poder alterar os dados dessa anamnese!","Atenção",JOptionPane.WARNING_MESSAGE);
	                }
	                      
	        	   else
	          	   {	 
	        		   if (tQtdTabagista.getText().equals(""))
             		 	{}
             		 	else{
             		 		try{
             		 			int qtdcigarros = Integer.parseInt(tQtdTabagista.getText());	
             		 			anamnese.setQtdCigarros(qtdcigarros);
             		 			
             		 			try{
                 		 			int peso = Integer.parseInt(tPeso.getText());	
                 		 			anamnese.setPeso(peso);
             		 			       		 	
                 		 			try{
                 		 				int freqcardiaca = Integer.parseInt(tFreqCardiaca.getText());	
                 		 				anamnese.setfreqCardiaca(freqcardiaca);
             		 			
                 		 				dao.alterar(anamnese);
                 		 				tReligiao.setText("");
                 		 				tProfissao.setText("");
                 		 				cbSexo.setSelectedItem("Selecione o Sexo");
                 		 				tRaca.setText("");
                 		 				tNasc.setText("");
                 		 				tPraticaEsporte.setText("");
                 		 				tAlergia.setText("");
                 		 				tDoenca.setText("");
                 		 				tMedicamento.setText("");
                 		 				tDoencaFamilia.setText("");
                 		 				tPeso.setText("");
                 		 				tAltura.setText("");
                 		 				tImc.setText("");
                 		 				tNome.setText("");
                 		 				tMatricula.setText("");
                 		 				tMatricula.setEnabled(true);
                 		 				tDataAnamnese.setText("");
                 		 				tQtdEtilista.setText("");
                 		 				cbEtilista.setSelectedItem("Selecione uma opção");
                 		 				tQtdTabagista.setText("");
                 		 				cbTabagista.setSelectedItem("Selecione uma opção");
                 		 				tTipoSang.setText("");
                 		 				tPressao.setText("");
                 		 				tFreqCardiaca.setText("");
	      		        			    	              			              		 
                 		 					JOptionPane.showMessageDialog(null,"Dados da Anamnese Alterados com sucesso!","Dados Alterados",JOptionPane.INFORMATION_MESSAGE);
                 		 			}
                 		 			catch(Exception e)
                 		 			{
                 		 				JOptionPane.showMessageDialog(null,"Freqüência cardíaca inválida!","Erro",JOptionPane.ERROR_MESSAGE);
                 		 			}
                 		 }
     		 			catch(Exception e)
     		 			{
     		 				JOptionPane.showMessageDialog(null,"Peso inválido!","Erro",JOptionPane.ERROR_MESSAGE);
     		 			}
     		 		}
     		 		catch(Exception e)
     		 		{
     		 		JOptionPane.showMessageDialog(null,"Quantidade de cigarros inválida!","Erro",JOptionPane.ERROR_MESSAGE);
     		    	}
	          	   }
	         }
  	       }
		}

		public void mouseClicked(MouseEvent e) 
		{
			JPanel pcampo=(JPanel)telaAnamnese.getContentPane().getComponent(1);
			JPanel pIdentPaciente=(JPanel)pcampo.getComponent(6);
	    	JTextField tDataAnamnese=(JTextField)pIdentPaciente.getComponent(7);
	    	
	    	Date data =new Date() ;
           	
	      	//alterando formato
	      	DateFormat dformat;
	      	String dataAtual;
	      	
	      	dformat=DateFormat.getDateInstance(DateFormat.MEDIUM);
	      	dataAtual=dformat.format(data).toString();

	      	      	
	      	tDataAnamnese.setText(dataAtual);
	      	tDataAnamnese.setEnabled(false);
	   	}

		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		
}
