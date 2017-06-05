package application;
	
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.transform.Rotate;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
		    PhongMaterial material = new PhongMaterial();
			Box paczka = new Box(260,200,60);
			Image img = new Image("marlboro.jpg");
			
			Rotate rx = new Rotate(0,0,0,0,Rotate.X_AXIS);
			Rotate ry = new Rotate(0,0,0,0,Rotate.Y_AXIS);
			Rotate rz = new Rotate(0,0,0,0,Rotate.Z_AXIS);
			
			rx.setAngle(-40);
			ry.setAngle(5);
			rz.setAngle(30);
			
			material.setDiffuseMap(img);
			paczka.setMaterial(material);
			paczka.setTranslateX(220);
			paczka.setTranslateY(370);
			paczka.getTransforms().addAll(rx,ry,rz);

			PerspectiveCamera cam = new PerspectiveCamera();
			cam.setFieldOfView(60);
			Group papierosy = papierosy();
			papierosy.setTranslateX(280);
			papierosy.setTranslateZ(265);
			papierosy.setTranslateY(20);
			papierosy.getTransforms().addAll(rx,ry,rz);
			
			
			Group root = new Group();
			root.getChildren().addAll(paczka, papierosy);
			Scene scene = new Scene(root,800,600, true, SceneAntialiasing.BALANCED);
			scene.setFill(Color.GREY);
			scene.setCamera(cam);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private Group szlug() {
	    PhongMaterial material2 = new PhongMaterial();
	    PhongMaterial material3 = new PhongMaterial();
	    PhongMaterial material4 = new PhongMaterial();
	    PhongMaterial material5 = new PhongMaterial();
		Image img2 = new Image("filter.jpg");
		Image img3 = new Image("cigarette.jpg");
		Image img4 = new Image("tobacco.jpg");
		Image img5 = new Image("tissue.jpg");
		Cylinder filter = new Cylinder(10,50);
		Cylinder gilza = new Cylinder(10,200);
		Cylinder tyton = new Cylinder(8,200);
		Cylinder filter2 = new Cylinder(8,50);
		material2.setDiffuseMap(img2);
		filter.setMaterial(material2);
		filter.setTranslateY(200);
		material3.setDiffuseMap(img3);
		gilza.setMaterial(material3);
		gilza.setTranslateY(320);
		material4.setDiffuseMap(img4);
		tyton.setMaterial(material4);
		tyton.setTranslateY(321);
		material5.setDiffuseMap(img5);
		filter2.setMaterial(material5);
		filter2.setTranslateY(199);
		return new Group(filter, gilza, tyton, filter2);
	}
	
	private Group papierosy() {
		TranslateTransition wysun = new TranslateTransition();
		wysun.setDuration(Duration.millis(1000));
		wysun.setCycleCount(1);
		
		Group papieros = szlug();
		papieros.setTranslateX(50);
		Group papieros2 = szlug();
		papieros2.setTranslateX(75);
		Group papieros3 = szlug();
		papieros3.setTranslateX(100);
		Group papieros4 = szlug();
		papieros4.setTranslateX(125);
		Group papieros5 = szlug();
		papieros5.setTranslateX(150);
		Group papieros6 = szlug();
		papieros6.setTranslateX(175);
		Group papieros7 = szlug();
		papieros7.setTranslateX(200);
		Group papieros8 = szlug();
		papieros8.setTranslateX(225);
		Group papieros9 = szlug();
		papieros9.setTranslateX(250);
		Group papieros10 = szlug();
		papieros10.setTranslateX(275);
		Group papieros11 = szlug();
		papieros11.setTranslateX(50);
		papieros11.setTranslateZ(20);
		Group papieros12 = szlug();
		papieros12.setTranslateX(75);
		papieros12.setTranslateZ(20);
		Group papieros13 = szlug();
		papieros13.setTranslateX(100);
		papieros13.setTranslateZ(20);
		Group papieros14 = szlug();
		papieros14.setTranslateX(125);
		papieros14.setTranslateZ(20);
		Group papieros15 = szlug();
		papieros15.setTranslateX(150);
		papieros15.setTranslateZ(20);
		Group papieros16 = szlug();
		papieros16.setTranslateX(175);
		papieros16.setTranslateZ(20);
		Group papieros17 = szlug();
		papieros17.setTranslateX(200);
		papieros17.setTranslateZ(20);
		Group papieros18 = szlug();
		papieros18.setTranslateX(225);
		papieros18.setTranslateZ(20);
		Group papieros19 = szlug();
		papieros19.setTranslateX(250);
		papieros19.setTranslateZ(20);
		Group papieros20 = szlug();
		papieros20.setTranslateX(275);
		papieros20.setTranslateZ(20);
		
		papieros.setOnMouseClicked(new EventHandler<MouseEvent>() {
	        @Override
	        public void handle(MouseEvent event) {
	            System.out.println("mouse click detected! "+event.getSource()+"event target :"+event.getTarget());
				wysun.setNode(papieros);
				wysun.setByY(-50);
				wysun.play();
	        }
	    });

		papieros2.setOnMouseClicked(new EventHandler<MouseEvent>() {
	        @Override
	        public void handle(MouseEvent event) {
	            System.out.println("mouse click detected! "+event.getSource()+"event target :"+event.getTarget());
				wysun.setNode(papieros2);
				wysun.setByY(-50);
				wysun.play();
	        }
	    });
		
		papieros3.setOnMouseClicked(new EventHandler<MouseEvent>() {
	        @Override
	        public void handle(MouseEvent event) {
	            System.out.println("mouse click detected! "+event.getSource()+"event target :"+event.getTarget());
				wysun.setNode(papieros3);
				wysun.setByY(-50);
				wysun.play();
	        }
	    });
		
		papieros4.setOnMouseClicked(new EventHandler<MouseEvent>() {
	        @Override
	        public void handle(MouseEvent event) {
	            System.out.println("mouse click detected! "+event.getSource()+"event target :"+event.getTarget());
				wysun.setNode(papieros4);
				wysun.setByY(-50);
				wysun.play();
	        }
	    });
		
		papieros5.setOnMouseClicked(new EventHandler<MouseEvent>() {
	        @Override
	        public void handle(MouseEvent event) {
	            System.out.println("mouse click detected! "+event.getSource()+"event target :"+event.getTarget());
				wysun.setNode(papieros5);
				wysun.setByY(-50);
				wysun.play();
	        }
	    });
		
		papieros6.setOnMouseClicked(new EventHandler<MouseEvent>() {
	        @Override
	        public void handle(MouseEvent event) {
	            System.out.println("mouse click detected! "+event.getSource()+"event target :"+event.getTarget());
				wysun.setNode(papieros6);
				wysun.setByY(-50);
				wysun.play();
	        }
	    });
		
		papieros7.setOnMouseClicked(new EventHandler<MouseEvent>() {
	        @Override
	        public void handle(MouseEvent event) {
	            System.out.println("mouse click detected! "+event.getSource()+"event target :"+event.getTarget());
				wysun.setNode(papieros7);
				wysun.setByY(-50);
				wysun.play();
	        }
	    });
		
		papieros8.setOnMouseClicked(new EventHandler<MouseEvent>() {
	        @Override
	        public void handle(MouseEvent event) {
	            System.out.println("mouse click detected! "+event.getSource()+"event target :"+event.getTarget());
				wysun.setNode(papieros8);
				wysun.setByY(-50);
				wysun.play();
	        }
	    });
		
		papieros9.setOnMouseClicked(new EventHandler<MouseEvent>() {
	        @Override
	        public void handle(MouseEvent event) {
	            System.out.println("mouse click detected! "+event.getSource()+"event target :"+event.getTarget());
				wysun.setNode(papieros9);
				wysun.setByY(-50);
				wysun.play();
	        }
	    });
		
		papieros10.setOnMouseClicked(new EventHandler<MouseEvent>() {
	        @Override
	        public void handle(MouseEvent event) {
	            System.out.println("mouse click detected! "+event.getSource()+"event target :"+event.getTarget());
				wysun.setNode(papieros10);
				wysun.setByY(-50);
				wysun.play();
	        }
	    });
		
		papieros11.setOnMouseClicked(new EventHandler<MouseEvent>() {
	        @Override
	        public void handle(MouseEvent event) {
	            System.out.println("mouse click detected! "+event.getSource()+"event target :"+event.getTarget());
				wysun.setNode(papieros11);
				wysun.setByY(-50);
				wysun.play();
	        }
	    });
		
		papieros12.setOnMouseClicked(new EventHandler<MouseEvent>() {
	        @Override
	        public void handle(MouseEvent event) {
	            System.out.println("mouse click detected! "+event.getSource()+"event target :"+event.getTarget());
				wysun.setNode(papieros12);
				wysun.setByY(-50);
				wysun.play();
	        }
	    });
		
		papieros13.setOnMouseClicked(new EventHandler<MouseEvent>() {
	        @Override
	        public void handle(MouseEvent event) {
	            System.out.println("mouse click detected! "+event.getSource()+"event target :"+event.getTarget());
				wysun.setNode(papieros13);
				wysun.setByY(-50);
				wysun.play();
	        }
	    });
		
		papieros14.setOnMouseClicked(new EventHandler<MouseEvent>() {
	        @Override
	        public void handle(MouseEvent event) {
	            System.out.println("mouse click detected! "+event.getSource()+"event target :"+event.getTarget());
				wysun.setNode(papieros14);
				wysun.setByY(-50);
				wysun.play();
	        }
	    });
		
		papieros15.setOnMouseClicked(new EventHandler<MouseEvent>() {
	        @Override
	        public void handle(MouseEvent event) {
	            System.out.println("mouse click detected! "+event.getSource()+"event target :"+event.getTarget());
				wysun.setNode(papieros15);
				wysun.setByY(-50);
				wysun.play();
	        }
	    });
		
		papieros16.setOnMouseClicked(new EventHandler<MouseEvent>() {
	        @Override
	        public void handle(MouseEvent event) {
	            System.out.println("mouse click detected! "+event.getSource()+"event target :"+event.getTarget());
				wysun.setNode(papieros16);
				wysun.setByY(-50);
				wysun.play();
	        }
	    });
		
		papieros17.setOnMouseClicked(new EventHandler<MouseEvent>() {
	        @Override
	        public void handle(MouseEvent event) {
	            System.out.println("mouse click detected! "+event.getSource()+"event target :"+event.getTarget());
				wysun.setNode(papieros17);
				wysun.setByY(-50);
				wysun.play();
	        }
	    });
		
		papieros18.setOnMouseClicked(new EventHandler<MouseEvent>() {
	        @Override
	        public void handle(MouseEvent event) {
	            System.out.println("mouse click detected! "+event.getSource()+"event target :"+event.getTarget());
				wysun.setNode(papieros18);
				wysun.setByY(-50);
				wysun.play();
	        }
	    });
		
		papieros19.setOnMouseClicked(new EventHandler<MouseEvent>() {
	        @Override
	        public void handle(MouseEvent event) {
	            System.out.println("mouse click detected! "+event.getSource()+"event target :"+event.getTarget());
				wysun.setNode(papieros19);
				wysun.setByY(-50);
				wysun.play();
	        }
	    });
		
		papieros20.setOnMouseClicked(new EventHandler<MouseEvent>() {
	        @Override
	        public void handle(MouseEvent event) {
	            System.out.println("mouse click detected! "+event.getSource()+"event target :"+event.getTarget());
				wysun.setNode(papieros20);
				wysun.setByY(-50);
				wysun.play();
	        }
	    });
		
		return new Group(papieros, papieros2, papieros3, papieros4, papieros5, papieros6, papieros7, papieros8, papieros9, papieros10, papieros11, papieros12, papieros13, papieros14, papieros15, papieros16, papieros17, papieros18, papieros19, papieros20);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
