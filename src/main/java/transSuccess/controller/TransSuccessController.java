package transSuccess.controller;

import java.awt.Point;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.http.HttpResponse;
import org.geojson.Feature;
import org.geojson.FeatureCollection;
import org.geojson.GeoJsonObject;
import org.geojson.LineString;
import org.geojson.LngLatAlt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import transSuccess.service.PublicApiService;
import transSuccess.service.TransSuccessService;

@ComponentScan("transSuccess")
@Controller
@EnableAutoConfiguration
public class TransSuccessController {

	@Autowired
	TransSuccessService transSuccessService;
	@Autowired
	PublicApiService publicApiService;

	@RequestMapping(value = "/areas", method = RequestMethod.GET,
			produces="application/json")
	public @ResponseBody String getTelAvivAreas() throws JsonProcessingException {
		
		JsonNode jsonNode = transSuccessService.getTelAvivAreas();
		return jsonNode.toString();
		
/*		FeatureCollection featureCollection = new FeatureCollection();
		Feature feature = new Feature();
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put("line", new String("171"));
		feature.setProperties(properties);
		GeoJsonObject geometry = new LineString(new LngLatAlt(34.816089, 31.878739),
				new LngLatAlt(34.817235, 31.878499), new LngLatAlt(34.817211, 31.878308));
		feature.setGeometry(geometry);
		featureCollection.add(feature);

//		String json = new ObjectMapper().writeValueAsString(featureCollection);
		return featureCollection;*/
	}
	
	@RequestMapping(value = "/areas2", method = RequestMethod.GET,
			produces="application/json")
	public @ResponseBody FeatureCollection getAreas() throws JsonProcessingException {
		FeatureCollection featureCollection = new FeatureCollection();
		Feature feature = new Feature();
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put("line", new String("171"));
		feature.setProperties(properties);

		GeoJsonObject geometry = new LineString(new LngLatAlt(34.816089, 31.878739),
				new LngLatAlt(34.817235, 31.878499), new LngLatAlt(34.817211, 31.878308),
				new LngLatAlt(34.81717, 31.878214), new LngLatAlt(34.81699, 31.877611),
				new LngLatAlt(34.816885, 31.877393), new LngLatAlt(34.816839, 31.877335),
				new LngLatAlt(34.816775, 31.877288), new LngLatAlt(34.816649, 31.877254),
				new LngLatAlt(34.816514, 31.877276), new LngLatAlt(34.815849, 31.877496),
				new LngLatAlt(34.815578, 31.877585), new LngLatAlt(34.81491, 31.877811),
				new LngLatAlt(34.814473, 31.877956), new LngLatAlt(34.81411, 31.878073),
				new LngLatAlt(34.813881, 31.878137), new LngLatAlt(34.813785, 31.878163),
				new LngLatAlt(34.81387, 31.878852), new LngLatAlt(34.81389, 31.878972),
				new LngLatAlt(34.813881, 31.879036), new LngLatAlt(34.813819, 31.879128),
				new LngLatAlt(34.813677, 31.879501), new LngLatAlt(34.81349, 31.879881),
				new LngLatAlt(34.813334, 31.880098), new LngLatAlt(34.81336, 31.880117),
				new LngLatAlt(34.813379, 31.880142), new LngLatAlt(34.813387, 31.880164),
				new LngLatAlt(34.813388, 31.880182), new LngLatAlt(34.813385, 31.880206),
				new LngLatAlt(34.813378, 31.880223), new LngLatAlt(34.813375, 31.880228),
				new LngLatAlt(34.813368, 31.880238), new LngLatAlt(34.81335, 31.880256),
				new LngLatAlt(34.813328, 31.880269), new LngLatAlt(34.813303, 31.880276),
				new LngLatAlt(34.813276, 31.880278), new LngLatAlt(34.813244, 31.880272),
				new LngLatAlt(34.81322, 31.880261), new LngLatAlt(34.813091, 31.88041),
				new LngLatAlt(34.81295, 31.88055), new LngLatAlt(34.812742, 31.880775),
				new LngLatAlt(34.812759, 31.880787), new LngLatAlt(34.812774, 31.880801),
				new LngLatAlt(34.812787, 31.880816), new LngLatAlt(34.812793, 31.880824),
				new LngLatAlt(34.812802, 31.880842), new LngLatAlt(34.812806, 31.880851),
				new LngLatAlt(34.812811, 31.880869), new LngLatAlt(34.812814, 31.880888),
				new LngLatAlt(34.812814, 31.880907), new LngLatAlt(34.812811, 31.880926),
				new LngLatAlt(34.813551, 31.881347), new LngLatAlt(34.814884, 31.882158),
				new LngLatAlt(34.815231, 31.882368), new LngLatAlt(34.81645, 31.8831),
				new LngLatAlt(34.816546, 31.883157), new LngLatAlt(34.816638, 31.883198),
				new LngLatAlt(34.816692, 31.883222), new LngLatAlt(34.816753, 31.883249),
				new LngLatAlt(34.816704, 31.883339), new LngLatAlt(34.816547, 31.883562),
				new LngLatAlt(34.816389, 31.883789), new LngLatAlt(34.816164, 31.884076),
				new LngLatAlt(34.815795, 31.884464), new LngLatAlt(34.815678, 31.884589),
				new LngLatAlt(34.815387, 31.884902), new LngLatAlt(34.815097, 31.88519),
				new LngLatAlt(34.815024, 31.885276), new LngLatAlt(34.814771, 31.885569),
				new LngLatAlt(34.814506, 31.886083), new LngLatAlt(34.814358, 31.886493),
				new LngLatAlt(34.814114, 31.887003), new LngLatAlt(34.813847, 31.887483),
				new LngLatAlt(34.813467, 31.888428), new LngLatAlt(34.81335, 31.888857),
				new LngLatAlt(34.813228, 31.889229), new LngLatAlt(34.813105, 31.889655),
				new LngLatAlt(34.813043, 31.889922), new LngLatAlt(34.81289, 31.890393),
				new LngLatAlt(34.812854, 31.890471), new LngLatAlt(34.812678, 31.890846),
				new LngLatAlt(34.812523, 31.891229), new LngLatAlt(34.812354, 31.891852),
				new LngLatAlt(34.812183, 31.892448), new LngLatAlt(34.812157, 31.892532),
				new LngLatAlt(34.812105, 31.892702), new LngLatAlt(34.812034, 31.892895),
				new LngLatAlt(34.81197, 31.893106), new LngLatAlt(34.811937, 31.893217),
				new LngLatAlt(34.811894, 31.89337), new LngLatAlt(34.811846, 31.893539),
				new LngLatAlt(34.811816, 31.893705), new LngLatAlt(34.81174, 31.894124),
				new LngLatAlt(34.811705, 31.894319), new LngLatAlt(34.811682, 31.894394),
				new LngLatAlt(34.811662, 31.894456), new LngLatAlt(34.811562, 31.894749),
				new LngLatAlt(34.811481, 31.894997), new LngLatAlt(34.811381, 31.895196),
				new LngLatAlt(34.811191, 31.895711), new LngLatAlt(34.810681, 31.897371),
				new LngLatAlt(34.8104, 31.89841), new LngLatAlt(34.810193, 31.898943),
				new LngLatAlt(34.810138, 31.89916), new LngLatAlt(34.810055, 31.899465),
				new LngLatAlt(34.809607, 31.90041), new LngLatAlt(34.809483, 31.900648),
				new LngLatAlt(34.809179, 31.901276), new LngLatAlt(34.809149, 31.901338),
				new LngLatAlt(34.809032, 31.901577), new LngLatAlt(34.808884, 31.901858),
				new LngLatAlt(34.808827, 31.901967), new LngLatAlt(34.808577, 31.902444),
				new LngLatAlt(34.808423, 31.902749), new LngLatAlt(34.807993, 31.903471),
				new LngLatAlt(34.807962, 31.903516), new LngLatAlt(34.807951, 31.903532),
				new LngLatAlt(34.807909, 31.903579), new LngLatAlt(34.807839, 31.903656),
				new LngLatAlt(34.807723, 31.90376), new LngLatAlt(34.807364, 31.90413),
				new LngLatAlt(34.807093, 31.90441), new LngLatAlt(34.806964, 31.904556),
				new LngLatAlt(34.806837, 31.904741), new LngLatAlt(34.806689, 31.905155),
				new LngLatAlt(34.806423, 31.905701), new LngLatAlt(34.806162, 31.906229),
				new LngLatAlt(34.805921, 31.906647), new LngLatAlt(34.805794, 31.906869),
				new LngLatAlt(34.805717, 31.907052), new LngLatAlt(34.805582, 31.907374),
				new LngLatAlt(34.805404, 31.907847), new LngLatAlt(34.805335, 31.908037),
				new LngLatAlt(34.805158, 31.908501), new LngLatAlt(34.804969, 31.908964),
				new LngLatAlt(34.80471, 31.909483), new LngLatAlt(34.804585, 31.909718),
				new LngLatAlt(34.804321, 31.910084), new LngLatAlt(34.804201, 31.910235),
				new LngLatAlt(34.804048, 31.9104), new LngLatAlt(34.803855, 31.910605),
				new LngLatAlt(34.803587, 31.910974), new LngLatAlt(34.803507, 31.911097),
				new LngLatAlt(34.803288, 31.911353), new LngLatAlt(34.80305, 31.911571),
				new LngLatAlt(34.803018, 31.911625), new LngLatAlt(34.802977, 31.911694),
				new LngLatAlt(34.802847, 31.911914), new LngLatAlt(34.802769, 31.912039),
				new LngLatAlt(34.80256, 31.912377), new LngLatAlt(34.801842, 31.913699),
				new LngLatAlt(34.801207, 31.914887), new LngLatAlt(34.800499, 31.916309),
				new LngLatAlt(34.800132, 31.916981), new LngLatAlt(34.799209, 31.918673),
				new LngLatAlt(34.799046, 31.918985), new LngLatAlt(34.798475, 31.920077),
				new LngLatAlt(34.798389, 31.920351), new LngLatAlt(34.798257, 31.920745),
				new LngLatAlt(34.798196, 31.921037), new LngLatAlt(34.798096, 31.921479),
				new LngLatAlt(34.798052, 31.921993), new LngLatAlt(34.798024, 31.922268),
				new LngLatAlt(34.797996, 31.922541), new LngLatAlt(34.797987, 31.922766),
				new LngLatAlt(34.797936, 31.923959), new LngLatAlt(34.79793, 31.924284),
				new LngLatAlt(34.797928, 31.924356), new LngLatAlt(34.797895, 31.924891),
				new LngLatAlt(34.797905, 31.925743), new LngLatAlt(34.797951, 31.926072),
				new LngLatAlt(34.798005, 31.926464), new LngLatAlt(34.79809, 31.926949),
				new LngLatAlt(34.79811, 31.927061), new LngLatAlt(34.798124, 31.927145),
				new LngLatAlt(34.798145, 31.927263), new LngLatAlt(34.798166, 31.927382),
				new LngLatAlt(34.798394, 31.928237), new LngLatAlt(34.798429, 31.928368),
				new LngLatAlt(34.798566, 31.928769), new LngLatAlt(34.798615, 31.92891),
				new LngLatAlt(34.798647, 31.929022), new LngLatAlt(34.798656, 31.929058),
				new LngLatAlt(34.79867, 31.929108), new LngLatAlt(34.798728, 31.929317),
				new LngLatAlt(34.798785, 31.929518), new LngLatAlt(34.799017, 31.930349),
				new LngLatAlt(34.799058, 31.93049), new LngLatAlt(34.799623, 31.932442),
				new LngLatAlt(34.79971, 31.932959), new LngLatAlt(34.799745, 31.933464),
				new LngLatAlt(34.799749, 31.933796), new LngLatAlt(34.799867, 31.935779),
				new LngLatAlt(34.799953, 31.936266), new LngLatAlt(34.799996, 31.936514),
				new LngLatAlt(34.799998, 31.936536), new LngLatAlt(34.800005, 31.936579),
				new LngLatAlt(34.800009, 31.936615), new LngLatAlt(34.800051, 31.936866),
				new LngLatAlt(34.800443, 31.939354), new LngLatAlt(34.800552, 31.940076),
				new LngLatAlt(34.800672, 31.941168), new LngLatAlt(34.800849, 31.942115),
				new LngLatAlt(34.800926, 31.942668), new LngLatAlt(34.801181, 31.94486),
				new LngLatAlt(34.801222, 31.94521), new LngLatAlt(34.801482, 31.94659),
				new LngLatAlt(34.801617, 31.947371), new LngLatAlt(34.801665, 31.947645),
				new LngLatAlt(34.801728, 31.948008), new LngLatAlt(34.801781, 31.948301),
				new LngLatAlt(34.801825, 31.94854), new LngLatAlt(34.801868, 31.948772),
				new LngLatAlt(34.801889, 31.948883), new LngLatAlt(34.801964, 31.949275),
				new LngLatAlt(34.80198, 31.94936), new LngLatAlt(34.80199, 31.949411),
				new LngLatAlt(34.802102, 31.95021), new LngLatAlt(34.802195, 31.950695),
				new LngLatAlt(34.8022, 31.950752), new LngLatAlt(34.802209, 31.950845),
				new LngLatAlt(34.80227, 31.951289), new LngLatAlt(34.802347, 31.951742),
				new LngLatAlt(34.802599, 31.953356), new LngLatAlt(34.802623, 31.953551),
				new LngLatAlt(34.802657, 31.95401), new LngLatAlt(34.802663, 31.954095),
				new LngLatAlt(34.802649, 31.954387), new LngLatAlt(34.802641, 31.954512),
				new LngLatAlt(34.802533, 31.955533), new LngLatAlt(34.802472, 31.955904),
				new LngLatAlt(34.802437, 31.956112), new LngLatAlt(34.802306, 31.956902),
				new LngLatAlt(34.80221, 31.957547), new LngLatAlt(34.802164, 31.958074),
				new LngLatAlt(34.802155, 31.958172), new LngLatAlt(34.802223, 31.958725),
				new LngLatAlt(34.802285, 31.958924), new LngLatAlt(34.802321, 31.959064),
				new LngLatAlt(34.802364, 31.959231), new LngLatAlt(34.802607, 31.960184),
				new LngLatAlt(34.802717, 31.960583), new LngLatAlt(34.802824, 31.96097),
				new LngLatAlt(34.802848, 31.961062), new LngLatAlt(34.802915, 31.961329),
				new LngLatAlt(34.802958, 31.961503), new LngLatAlt(34.803031, 31.961849),
				new LngLatAlt(34.803056, 31.961968), new LngLatAlt(34.803078, 31.96215),
				new LngLatAlt(34.803096, 31.962292), new LngLatAlt(34.803113, 31.962687),
				new LngLatAlt(34.803117, 31.962773), new LngLatAlt(34.803086, 31.96353),
				new LngLatAlt(34.803048, 31.964061), new LngLatAlt(34.803041, 31.964159),
				new LngLatAlt(34.802955, 31.964785), new LngLatAlt(34.802925, 31.965008),
				new LngLatAlt(34.802821, 31.965828), new LngLatAlt(34.8028, 31.965991),
				new LngLatAlt(34.802754, 31.966357), new LngLatAlt(34.802741, 31.966689),
				new LngLatAlt(34.802746, 31.966712), new LngLatAlt(34.802753, 31.966747),
				new LngLatAlt(34.802757, 31.966769), new LngLatAlt(34.802819, 31.966935),
				new LngLatAlt(34.802887, 31.967066), new LngLatAlt(34.803209, 31.967504),
				new LngLatAlt(34.803568, 31.967929), new LngLatAlt(34.803592, 31.967963),
				new LngLatAlt(34.8038, 31.96826), new LngLatAlt(34.804115, 31.968683),
				new LngLatAlt(34.804458, 31.969083), new LngLatAlt(34.80456, 31.969191),
				new LngLatAlt(34.805122, 31.969918), new LngLatAlt(34.805641, 31.97055),
				new LngLatAlt(34.806122, 31.971143), new LngLatAlt(34.806158, 31.971194),
				new LngLatAlt(34.806223, 31.971338), new LngLatAlt(34.806297, 31.971483),
				new LngLatAlt(34.806339, 31.971658), new LngLatAlt(34.806388, 31.971843),
				new LngLatAlt(34.806425, 31.972093), new LngLatAlt(34.806467, 31.972275),
				new LngLatAlt(34.806507, 31.97244), new LngLatAlt(34.806525, 31.972512),
				new LngLatAlt(34.806527, 31.972532), new LngLatAlt(34.806682, 31.972959),
				new LngLatAlt(34.806862, 31.973454), new LngLatAlt(34.806868, 31.973474),
				new LngLatAlt(34.807092, 31.974125), new LngLatAlt(34.80716, 31.974374),
				new LngLatAlt(34.80774, 31.976127), new LngLatAlt(34.807898, 31.976613),
				new LngLatAlt(34.807918, 31.976674), new LngLatAlt(34.807976, 31.976846),
				new LngLatAlt(34.808062, 31.977109), new LngLatAlt(34.808296, 31.97783),
				new LngLatAlt(34.809183, 31.980413), new LngLatAlt(34.809283, 31.98067),
				new LngLatAlt(34.809293, 31.980696), new LngLatAlt(34.809313, 31.980753),
				new LngLatAlt(34.809775, 31.982056), new LngLatAlt(34.810302, 31.98352),
				new LngLatAlt(34.810333, 31.98361), new LngLatAlt(34.810401, 31.983808),
				new LngLatAlt(34.810484, 31.984049), new LngLatAlt(34.810498, 31.984091),
				new LngLatAlt(34.81149, 31.986973), new LngLatAlt(34.812052, 31.988669),
				new LngLatAlt(34.812328, 31.989678), new LngLatAlt(34.812394, 31.98992),
				new LngLatAlt(34.812591, 31.990608), new LngLatAlt(34.812849, 31.991219),
				new LngLatAlt(34.813218, 31.991809), new LngLatAlt(34.813685, 31.99259),
				new LngLatAlt(34.813795, 31.992772), new LngLatAlt(34.813949, 31.992968),
				new LngLatAlt(34.814047, 31.993096), new LngLatAlt(34.814221, 31.993324),
				new LngLatAlt(34.814539, 31.993738), new LngLatAlt(34.814815, 31.994103),
				new LngLatAlt(34.815157, 31.994472), new LngLatAlt(34.815813, 31.995045),
				new LngLatAlt(34.816069, 31.99526), new LngLatAlt(34.817117, 31.996139),
				new LngLatAlt(34.817351, 31.996335), new LngLatAlt(34.817383, 31.996362),
				new LngLatAlt(34.817931, 31.996858), new LngLatAlt(34.81836, 31.997299),
				new LngLatAlt(34.818571, 31.997549), new LngLatAlt(34.818728, 31.997756),
				new LngLatAlt(34.818875, 31.997982), new LngLatAlt(34.819169, 31.998508),
				new LngLatAlt(34.819653, 31.999472), new LngLatAlt(34.819871, 31.999879),
				new LngLatAlt(34.820003, 32.000108), new LngLatAlt(34.820054, 32.000189),
				new LngLatAlt(34.820115, 32.000296), new LngLatAlt(34.820161, 32.000382),
				new LngLatAlt(34.820209, 32.000455), new LngLatAlt(34.820324, 32.000604),
				new LngLatAlt(34.820368, 32.000649), new LngLatAlt(34.820399, 32.00068),
				new LngLatAlt(34.82053, 32.000818), new LngLatAlt(34.820586, 32.000875),
				new LngLatAlt(34.82072, 32.001), new LngLatAlt(34.820873, 32.001115),
				new LngLatAlt(34.821034, 32.00123), new LngLatAlt(34.821049, 32.001243),
				new LngLatAlt(34.821093, 32.001278), new LngLatAlt(34.821163, 32.001359),
				new LngLatAlt(34.821188, 32.001413), new LngLatAlt(34.820918, 32.001781),
				new LngLatAlt(34.820658, 32.002158), new LngLatAlt(34.820464, 32.002439),
				new LngLatAlt(34.820378, 32.002556), new LngLatAlt(34.820221, 32.002772),
				new LngLatAlt(34.820145, 32.002882), new LngLatAlt(34.820075, 32.002973),
				new LngLatAlt(34.819996, 32.003083), new LngLatAlt(34.819896, 32.003211),
				new LngLatAlt(34.818805, 32.004531), new LngLatAlt(34.818049, 32.005481),
				new LngLatAlt(34.817742, 32.00587), new LngLatAlt(34.817694, 32.005931),
				new LngLatAlt(34.817661, 32.005972), new LngLatAlt(34.817541, 32.006125),
				new LngLatAlt(34.817358, 32.006375), new LngLatAlt(34.816914, 32.007021),
				new LngLatAlt(34.816014, 32.008293), new LngLatAlt(34.815413, 32.009081),
				new LngLatAlt(34.815181, 32.009412), new LngLatAlt(34.814574, 32.010209),
				new LngLatAlt(34.81453, 32.010269), new LngLatAlt(34.814468, 32.010351),
				new LngLatAlt(34.814365, 32.010503), new LngLatAlt(34.814275, 32.010639),
				new LngLatAlt(34.814238, 32.010696), new LngLatAlt(34.814049, 32.010947),
				new LngLatAlt(34.813519, 32.011658), new LngLatAlt(34.813385, 32.011858),
				new LngLatAlt(34.813073, 32.012286), new LngLatAlt(34.811294, 32.014821),
				new LngLatAlt(34.811064, 32.015175), new LngLatAlt(34.810914, 32.015438),
				new LngLatAlt(34.810775, 32.015613), new LngLatAlt(34.809814, 32.016913),
				new LngLatAlt(34.808873, 32.018029), new LngLatAlt(34.808515, 32.01839),
				new LngLatAlt(34.808258, 32.018691), new LngLatAlt(34.807919, 32.019086),
				new LngLatAlt(34.80745, 32.019557), new LngLatAlt(34.807077, 32.020009),
				new LngLatAlt(34.806026, 32.021183), new LngLatAlt(34.805797, 32.021428),
				new LngLatAlt(34.805471, 32.021763), new LngLatAlt(34.805459, 32.021774),
				new LngLatAlt(34.804719, 32.022311), new LngLatAlt(34.804386, 32.022545),
				new LngLatAlt(34.804291, 32.022612), new LngLatAlt(34.803764, 32.02302),
				new LngLatAlt(34.803573, 32.023158), new LngLatAlt(34.803362, 32.023345),
				new LngLatAlt(34.803179, 32.023504), new LngLatAlt(34.802902, 32.02377),
				new LngLatAlt(34.802824, 32.023845), new LngLatAlt(34.802628, 32.024059),
				new LngLatAlt(34.80221, 32.024532), new LngLatAlt(34.80182, 32.024917),
				new LngLatAlt(34.801444, 32.025275), new LngLatAlt(34.80121, 32.025489),
				new LngLatAlt(34.800994, 32.025664), new LngLatAlt(34.800562, 32.026005),
				new LngLatAlt(34.799624, 32.026715), new LngLatAlt(34.79896, 32.027231),
				new LngLatAlt(34.798925, 32.027258), new LngLatAlt(34.798335, 32.027702),
				new LngLatAlt(34.798176, 32.027826), new LngLatAlt(34.797693, 32.02822),
				new LngLatAlt(34.797617, 32.028278), new LngLatAlt(34.797214, 32.028582),
				new LngLatAlt(34.797019, 32.028736), new LngLatAlt(34.79606, 32.029485),
				new LngLatAlt(34.795886, 32.029603), new LngLatAlt(34.795128, 32.030164),
				new LngLatAlt(34.794893, 32.030344), new LngLatAlt(34.794055, 32.030907),
				new LngLatAlt(34.793446, 32.031315), new LngLatAlt(34.792591, 32.031854),
				new LngLatAlt(34.791615, 32.032402), new LngLatAlt(34.790651, 32.032901),
				new LngLatAlt(34.789789, 32.033336), new LngLatAlt(34.78908, 32.033672),
				new LngLatAlt(34.788703, 32.033847), new LngLatAlt(34.786317, 32.034958),
				new LngLatAlt(34.786039, 32.035099), new LngLatAlt(34.785948, 32.03514),
				new LngLatAlt(34.78574, 32.035235), new LngLatAlt(34.783761, 32.036063),
				new LngLatAlt(34.783098, 32.036337), new LngLatAlt(34.78221, 32.036712),
				new LngLatAlt(34.781498, 32.037006), new LngLatAlt(34.78042, 32.037534),
				new LngLatAlt(34.779656, 32.03795), new LngLatAlt(34.779423, 32.038103),
				new LngLatAlt(34.779341, 32.038191), new LngLatAlt(34.779302, 32.038264),
				new LngLatAlt(34.779301, 32.03833), new LngLatAlt(34.779331, 32.038403),
				new LngLatAlt(34.779378, 32.038477), new LngLatAlt(34.7797, 32.038793),
				new LngLatAlt(34.77985, 32.03893), new LngLatAlt(34.780068, 32.03911),
				new LngLatAlt(34.780206, 32.039235), new LngLatAlt(34.780377, 32.039397),
				new LngLatAlt(34.780476, 32.039487), new LngLatAlt(34.780681, 32.0397),
				new LngLatAlt(34.780865, 32.03991), new LngLatAlt(34.781045, 32.040109),
				new LngLatAlt(34.781225, 32.040278), new LngLatAlt(34.781424, 32.040503),
				new LngLatAlt(34.781608, 32.040746), new LngLatAlt(34.78175, 32.040954),
				new LngLatAlt(34.781979, 32.04124), new LngLatAlt(34.782118, 32.041421),
				new LngLatAlt(34.782306, 32.041695), new LngLatAlt(34.782545, 32.04207),
				new LngLatAlt(34.782751, 32.042445), new LngLatAlt(34.782821, 32.042581),
				new LngLatAlt(34.782896, 32.042739), new LngLatAlt(34.782989, 32.042976),
				new LngLatAlt(34.783106, 32.043145), new LngLatAlt(34.783148, 32.043226),
				new LngLatAlt(34.78327, 32.043512), new LngLatAlt(34.783365, 32.043816),
				new LngLatAlt(34.783461, 32.044128), new LngLatAlt(34.783516, 32.044349),
				new LngLatAlt(34.783595, 32.044687), new LngLatAlt(34.783612, 32.044761),
				new LngLatAlt(34.78366, 32.045036), new LngLatAlt(34.783709, 32.045382),
				new LngLatAlt(34.783805, 32.045953), new LngLatAlt(34.783917, 32.046472),
				new LngLatAlt(34.784045, 32.04691), new LngLatAlt(34.784081, 32.047068),
				new LngLatAlt(34.784222, 32.047573), new LngLatAlt(34.784384, 32.047955),
				new LngLatAlt(34.784593, 32.048457), new LngLatAlt(34.78472, 32.048752),
				new LngLatAlt(34.784727, 32.048762), new LngLatAlt(34.784764, 32.048902),
				new LngLatAlt(34.784795, 32.049036), new LngLatAlt(34.784794, 32.049192),
				new LngLatAlt(34.784768, 32.049305), new LngLatAlt(34.784728, 32.049398),
				new LngLatAlt(34.78469, 32.049452), new LngLatAlt(34.784599, 32.049548),
				new LngLatAlt(34.784476, 32.049648), new LngLatAlt(34.784381, 32.049728),
				new LngLatAlt(34.784312, 32.049798), new LngLatAlt(34.784265, 32.049844),
				new LngLatAlt(34.784236, 32.049873), new LngLatAlt(34.784159, 32.049958),
				new LngLatAlt(34.784109, 32.050007), new LngLatAlt(34.784052, 32.050082),
				new LngLatAlt(34.783994, 32.050151), new LngLatAlt(34.783905, 32.050291),
				new LngLatAlt(34.783854, 32.050387), new LngLatAlt(34.783764, 32.0506),
				new LngLatAlt(34.783716, 32.050729), new LngLatAlt(34.783526, 32.051256),
				new LngLatAlt(34.783404, 32.051622), new LngLatAlt(34.783359, 32.051826),
				new LngLatAlt(34.783334, 32.05198), new LngLatAlt(34.783319, 32.052098),
				new LngLatAlt(34.783314, 32.052144), new LngLatAlt(34.783305, 32.052363),
				new LngLatAlt(34.783299, 32.052786), new LngLatAlt(34.783315, 32.053493),
				new LngLatAlt(34.783323, 32.053681), new LngLatAlt(34.783353, 32.054305),
				new LngLatAlt(34.783365, 32.054387), new LngLatAlt(34.783377, 32.054457),
				new LngLatAlt(34.783401, 32.054865), new LngLatAlt(34.783423, 32.055054),
				new LngLatAlt(34.783443, 32.055194), new LngLatAlt(34.783493, 32.055534),
				new LngLatAlt(34.783599, 32.056073), new LngLatAlt(34.783648, 32.056312),
				new LngLatAlt(34.783837, 32.057204), new LngLatAlt(34.783947, 32.057797),
				new LngLatAlt(34.784069, 32.058333), new LngLatAlt(34.784193, 32.058794),
				new LngLatAlt(34.784281, 32.059121), new LngLatAlt(34.784288, 32.059154),
				new LngLatAlt(34.784295, 32.059187), new LngLatAlt(34.784311, 32.059265),
				new LngLatAlt(34.784335, 32.059341), new LngLatAlt(34.784412, 32.059552),
				new LngLatAlt(34.784515, 32.060085), new LngLatAlt(34.784601, 32.060541),
				new LngLatAlt(34.78463, 32.060669), new LngLatAlt(34.784838, 32.061678),
				new LngLatAlt(34.784955, 32.062148), new LngLatAlt(34.785024, 32.062379),
				new LngLatAlt(34.785038, 32.062416), new LngLatAlt(34.785183, 32.062805),
				new LngLatAlt(34.785318, 32.063141), new LngLatAlt(34.785357, 32.063219),
				new LngLatAlt(34.785403, 32.06332), new LngLatAlt(34.785779, 32.064028),
				new LngLatAlt(34.786115, 32.064659), new LngLatAlt(34.786308, 32.065175),
				new LngLatAlt(34.786365, 32.065346), new LngLatAlt(34.786445, 32.065592),
				new LngLatAlt(34.7871, 32.067557), new LngLatAlt(34.787444, 32.068399),
				new LngLatAlt(34.787531, 32.068568), new LngLatAlt(34.787605, 32.068723),
				new LngLatAlt(34.787748, 32.069035), new LngLatAlt(34.78784, 32.069238),
				new LngLatAlt(34.787986, 32.069512), new LngLatAlt(34.788155, 32.069723),
				new LngLatAlt(34.788622, 32.070193), new LngLatAlt(34.788744, 32.070314),
				new LngLatAlt(34.788812, 32.070381), new LngLatAlt(34.78896, 32.070543),
				new LngLatAlt(34.789066, 32.070662), new LngLatAlt(34.789116, 32.070728),
				new LngLatAlt(34.789397, 32.07105), new LngLatAlt(34.78944, 32.071109),
				new LngLatAlt(34.789705, 32.071431), new LngLatAlt(34.78971, 32.071437),
				new LngLatAlt(34.789819, 32.0716), new LngLatAlt(34.789948, 32.07181),
				new LngLatAlt(34.790035, 32.071946), new LngLatAlt(34.790246, 32.07247),
				new LngLatAlt(34.790355, 32.072758), new LngLatAlt(34.790441, 32.073004),
				new LngLatAlt(34.79055, 32.073306), new LngLatAlt(34.790614, 32.073458),
				new LngLatAlt(34.790902, 32.074138), new LngLatAlt(34.791109, 32.074618),
				new LngLatAlt(34.791269, 32.075004), new LngLatAlt(34.791386, 32.075284),
				new LngLatAlt(34.791651, 32.075922), new LngLatAlt(34.791809, 32.076187),
				new LngLatAlt(34.791977, 32.076455), new LngLatAlt(34.792085, 32.07665),
				new LngLatAlt(34.792102, 32.076676), new LngLatAlt(34.792207, 32.076834),
				new LngLatAlt(34.792937, 32.077937), new LngLatAlt(34.793092, 32.078209),
				new LngLatAlt(34.793149, 32.078323), new LngLatAlt(34.793158, 32.078344),
				new LngLatAlt(34.793215, 32.078482), new LngLatAlt(34.793311, 32.078701),
				new LngLatAlt(34.793484, 32.079058), new LngLatAlt(34.79351, 32.079102),
				new LngLatAlt(34.793807, 32.079488), new LngLatAlt(34.793955, 32.079763),
				new LngLatAlt(34.79401, 32.079866), new LngLatAlt(34.794145, 32.080267),
				new LngLatAlt(34.794232, 32.080616), new LngLatAlt(34.794501, 32.081843),
				new LngLatAlt(34.794569, 32.082191), new LngLatAlt(34.794662, 32.082546),
				new LngLatAlt(34.794686, 32.082658), new LngLatAlt(34.794744, 32.082925),
				new LngLatAlt(34.794777, 32.08308), new LngLatAlt(34.794936, 32.083219),
				new LngLatAlt(34.794982, 32.083347), new LngLatAlt(34.795084, 32.083837),
				new LngLatAlt(34.795194, 32.084362), new LngLatAlt(34.79521, 32.084449),
				new LngLatAlt(34.795211, 32.08454), new LngLatAlt(34.795213, 32.08467),
				new LngLatAlt(34.795208, 32.084795), new LngLatAlt(34.795184, 32.084985),
				new LngLatAlt(34.795191, 32.085019), new LngLatAlt(34.795256, 32.085356),
				new LngLatAlt(34.795317, 32.085663), new LngLatAlt(34.795324, 32.085702),
				new LngLatAlt(34.795332, 32.085745), new LngLatAlt(34.795401, 32.086124),
				new LngLatAlt(34.795508, 32.086734), new LngLatAlt(34.795544, 32.086948),
				new LngLatAlt(34.795593, 32.087236), new LngLatAlt(34.795597, 32.087261),
				new LngLatAlt(34.795651, 32.087744), new LngLatAlt(34.795673, 32.088362),
				new LngLatAlt(34.79567, 32.0891), new LngLatAlt(34.795664, 32.089294),
				new LngLatAlt(34.795632, 32.089712), new LngLatAlt(34.795605, 32.089873),
				new LngLatAlt(34.795569, 32.090083), new LngLatAlt(34.795501, 32.090528),
				new LngLatAlt(34.795372, 32.091155), new LngLatAlt(34.795347, 32.091274),
				new LngLatAlt(34.79533, 32.091343), new LngLatAlt(34.79524, 32.091657),
				new LngLatAlt(34.795212, 32.091757), new LngLatAlt(34.795088, 32.092279),
				new LngLatAlt(34.794876, 32.093202), new LngLatAlt(34.794555, 32.094563),
				new LngLatAlt(34.794163, 32.096185), new LngLatAlt(34.793999, 32.096927),
				new LngLatAlt(34.793949, 32.097114), new LngLatAlt(34.793933, 32.097175),
				new LngLatAlt(34.793886, 32.097388), new LngLatAlt(34.793868, 32.097472),
				new LngLatAlt(34.793848, 32.097541), new LngLatAlt(34.79376, 32.09804),
				new LngLatAlt(34.793728, 32.098275), new LngLatAlt(34.793703, 32.098534),
				new LngLatAlt(34.793676, 32.099041), new LngLatAlt(34.793597, 32.099417),
				new LngLatAlt(34.793539, 32.099743), new LngLatAlt(34.793531, 32.099781),
				new LngLatAlt(34.793516, 32.099846), new LngLatAlt(34.793508, 32.099881),
				new LngLatAlt(34.79349, 32.099965), new LngLatAlt(34.793426, 32.100253),
				new LngLatAlt(34.793404, 32.100372), new LngLatAlt(34.792922, 32.102349),
				new LngLatAlt(34.792832, 32.102812), new LngLatAlt(34.792816, 32.102914),
				new LngLatAlt(34.792771, 32.103082), new LngLatAlt(34.792719, 32.103333),
				new LngLatAlt(34.79267, 32.103634), new LngLatAlt(34.792565, 32.104187),
				new LngLatAlt(34.792531, 32.104343), new LngLatAlt(34.792484, 32.104593),
				new LngLatAlt(34.792415, 32.104942), new LngLatAlt(34.792364, 32.105205),
				new LngLatAlt(34.792122, 32.106489), new LngLatAlt(34.792046, 32.107026),
				new LngLatAlt(34.792014, 32.107666), new LngLatAlt(34.792025, 32.108381),
				new LngLatAlt(34.792102, 32.109733), new LngLatAlt(34.792165, 32.110326),
				new LngLatAlt(34.792521, 32.112185), new LngLatAlt(34.792611, 32.112352),
				new LngLatAlt(34.792741, 32.112464), new LngLatAlt(34.792876, 32.112536),
				new LngLatAlt(34.792979, 32.112575), new LngLatAlt(34.793441, 32.112608),
				new LngLatAlt(34.793822, 32.112637), new LngLatAlt(34.794123, 32.112666),
				new LngLatAlt(34.794419, 32.112695), new LngLatAlt(34.794851, 32.112727),
				new LngLatAlt(34.795617, 32.112788), new LngLatAlt(34.795754, 32.112798),
				new LngLatAlt(34.795787, 32.112801), new LngLatAlt(34.79585, 32.11281),
				new LngLatAlt(34.796294, 32.112857), new LngLatAlt(34.79682, 32.112911),
				new LngLatAlt(34.797205, 32.11294), new LngLatAlt(34.797635, 32.112974),
				new LngLatAlt(34.797734, 32.112982), new LngLatAlt(34.798056, 32.113012),
				new LngLatAlt(34.799233, 32.113127), new LngLatAlt(34.800481, 32.113233),
				new LngLatAlt(34.800732, 32.113254), new LngLatAlt(34.801129, 32.113299),
				new LngLatAlt(34.801242, 32.113256), new LngLatAlt(34.801308, 32.113223),
				new LngLatAlt(34.801386, 32.11316), new LngLatAlt(34.801386, 32.113077),
				new LngLatAlt(34.801505, 32.111459), new LngLatAlt(34.801573, 32.110771),
				new LngLatAlt(34.801575, 32.110697), new LngLatAlt(34.80158, 32.110433),
				new LngLatAlt(34.801584, 32.110159), new LngLatAlt(34.801587, 32.109883),
				new LngLatAlt(34.801577, 32.109743), new LngLatAlt(34.801518, 32.109083),
				new LngLatAlt(34.801509, 32.108982), new LngLatAlt(34.801417, 32.108521),
				new LngLatAlt(34.80131, 32.108127), new LngLatAlt(34.801157, 32.107718),
				new LngLatAlt(34.800968, 32.107224), new LngLatAlt(34.800699, 32.106687),
				new LngLatAlt(34.800533, 32.106415), new LngLatAlt(34.800523, 32.106331),
				new LngLatAlt(34.800597, 32.106296), new LngLatAlt(34.800783, 32.106207),
				new LngLatAlt(34.800893, 32.106167), new LngLatAlt(34.801013, 32.106132),
				new LngLatAlt(34.801222, 32.106094), new LngLatAlt(34.801371, 32.106102),
				new LngLatAlt(34.801487, 32.106122), new LngLatAlt(34.801594, 32.106152),
				new LngLatAlt(34.801697, 32.106192), new LngLatAlt(34.802023, 32.106344),
				new LngLatAlt(34.802041, 32.106332), new LngLatAlt(34.802057, 32.106324),
				new LngLatAlt(34.802066, 32.106321), new LngLatAlt(34.802084, 32.106316),
				new LngLatAlt(34.802102, 32.106312), new LngLatAlt(34.802121, 32.10631),
				new LngLatAlt(34.80214, 32.106311), new LngLatAlt(34.802149, 32.106312),
				new LngLatAlt(34.802168, 32.106315), new LngLatAlt(34.802186, 32.10632),
				new LngLatAlt(34.802203, 32.106327), new LngLatAlt(34.802211, 32.106331),
				new LngLatAlt(34.802226, 32.10634), new LngLatAlt(34.80224, 32.106351),
				new LngLatAlt(34.802246, 32.106357), new LngLatAlt(34.802257, 32.106369),
				new LngLatAlt(34.802261, 32.106376), new LngLatAlt(34.802719, 32.106522),
				new LngLatAlt(34.803018, 32.106636), new LngLatAlt(34.803262, 32.106685),
				new LngLatAlt(34.803635, 32.106714), new LngLatAlt(34.803959, 32.10672),
				new LngLatAlt(34.804122, 32.106713), new LngLatAlt(34.804305, 32.106709),
				new LngLatAlt(34.804502, 32.106678), new LngLatAlt(34.804526, 32.106654),
				new LngLatAlt(34.804553, 32.106636), new LngLatAlt(34.804584, 32.106627),
				new LngLatAlt(34.804592, 32.106624), new LngLatAlt(34.804643, 32.106615),
				new LngLatAlt(34.804664, 32.106613), new LngLatAlt(34.80474, 32.106629),
				new LngLatAlt(34.804771, 32.106644), new LngLatAlt(34.804787, 32.106659),
				new LngLatAlt(34.8048, 32.106671), new LngLatAlt(34.804812, 32.106686),
				new LngLatAlt(34.804831, 32.106721), new LngLatAlt(34.804952, 32.106769),
				new LngLatAlt(34.805087, 32.106839), new LngLatAlt(34.805237, 32.106941),
				new LngLatAlt(34.805307, 32.106992), new LngLatAlt(34.805483, 32.107164),
				new LngLatAlt(34.805673, 32.107371), new LngLatAlt(34.805729, 32.107438),
				new LngLatAlt(34.805787, 32.107504), new LngLatAlt(34.805854, 32.107587),
				new LngLatAlt(34.805925, 32.107687), new LngLatAlt(34.805965, 32.107765),
				new LngLatAlt(34.806255, 32.108193), new LngLatAlt(34.806417, 32.108447),
				new LngLatAlt(34.806635, 32.108834), new LngLatAlt(34.806848, 32.109238),
				new LngLatAlt(34.807033, 32.1096), new LngLatAlt(34.807137, 32.109845),
				new LngLatAlt(34.807167, 32.110043), new LngLatAlt(34.807243, 32.110416),
				new LngLatAlt(34.80727, 32.110414), new LngLatAlt(34.807291, 32.110414),
				new LngLatAlt(34.807302, 32.110415), new LngLatAlt(34.807312, 32.110416),
				new LngLatAlt(34.807332, 32.110421), new LngLatAlt(34.807352, 32.110427),
				new LngLatAlt(34.80737, 32.110435), new LngLatAlt(34.807379, 32.11044),
				new LngLatAlt(34.807395, 32.11045), new LngLatAlt(34.807403, 32.110456),
				new LngLatAlt(34.807416, 32.110469), new LngLatAlt(34.807427, 32.110483),
				new LngLatAlt(34.807436, 32.110498), new LngLatAlt(34.807439, 32.110505),
				new LngLatAlt(34.807445, 32.110521), new LngLatAlt(34.807447, 32.110537),
				new LngLatAlt(34.807447, 32.110546), new LngLatAlt(34.807446, 32.110562),
				new LngLatAlt(34.807442, 32.110578), new LngLatAlt(34.807436, 32.110592),
				new LngLatAlt(34.807431, 32.110601), new LngLatAlt(34.807421, 32.110615),
				new LngLatAlt(34.807409, 32.110629), new LngLatAlt(34.807394, 32.110641),
				new LngLatAlt(34.807378, 32.110651), new LngLatAlt(34.807369, 32.110656),
				new LngLatAlt(34.807351, 32.110664), new LngLatAlt(34.807331, 32.11067),
				new LngLatAlt(34.807408, 32.110994), new LngLatAlt(34.80743, 32.111175),
				new LngLatAlt(34.807435, 32.111219), new LngLatAlt(34.807449, 32.111707),
				new LngLatAlt(34.807463, 32.111998), new LngLatAlt(34.807503, 32.112133),
				new LngLatAlt(34.807526, 32.112365), new LngLatAlt(34.80754, 32.112586),
				new LngLatAlt(34.807556, 32.112922), new LngLatAlt(34.807555, 32.113257),
				new LngLatAlt(34.807552, 32.113382), new LngLatAlt(34.807551, 32.11342),
				new LngLatAlt(34.807541, 32.113589), new LngLatAlt(34.807538, 32.113644),
				new LngLatAlt(34.807488, 32.114106), new LngLatAlt(34.807448, 32.114424),
				new LngLatAlt(34.807412, 32.114712), new LngLatAlt(34.807402, 32.11479),
				new LngLatAlt(34.807382, 32.115194), new LngLatAlt(34.807337, 32.115878),
				new LngLatAlt(34.80733, 32.116004), new LngLatAlt(34.807318, 32.116206),
				new LngLatAlt(34.807292, 32.116585), new LngLatAlt(34.807267, 32.11693),
				new LngLatAlt(34.807258, 32.116979), new LngLatAlt(34.807237, 32.117024),
				new LngLatAlt(34.807214, 32.117063), new LngLatAlt(34.807226, 32.117083),
				new LngLatAlt(34.807229, 32.117106), new LngLatAlt(34.807229, 32.11712),
				new LngLatAlt(34.807218, 32.117148), new LngLatAlt(34.807193, 32.117207),
				new LngLatAlt(34.807124, 32.117277), new LngLatAlt(34.807054, 32.117325),
				new LngLatAlt(34.806992, 32.117355), new LngLatAlt(34.806914, 32.117376),
				new LngLatAlt(34.806877, 32.117373), new LngLatAlt(34.806859, 32.117371),
				new LngLatAlt(34.806835, 32.117361), new LngLatAlt(34.806723, 32.117375),
				new LngLatAlt(34.806673, 32.117382), new LngLatAlt(34.806348, 32.11744),
				new LngLatAlt(34.806285, 32.117451), new LngLatAlt(34.806064, 32.117491),
				new LngLatAlt(34.805652, 32.117555), new LngLatAlt(34.805241, 32.117619),
				new LngLatAlt(34.804068, 32.117801), new LngLatAlt(34.803631, 32.117873),
				new LngLatAlt(34.803543, 32.117881), new LngLatAlt(34.803516, 32.117804),
				new LngLatAlt(34.803484, 32.117728), new LngLatAlt(34.803474, 32.117676),
				new LngLatAlt(34.80347, 32.11761), new LngLatAlt(34.803471, 32.117526));
		feature.setGeometry(geometry);
		featureCollection.add(feature);

//		String json = new ObjectMapper().writeValueAsString(featureCollection);
		return featureCollection;
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(TransSuccessController.class, args);
		// PublicApiService publicApiService = new PublicApiService();
		// publicApiService.getPublicTrade();
	}
}