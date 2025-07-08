package com.blogapp;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

//import java.util.List;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.repository.CrudRepository;

import com.blogapp.entity.Bus;
import com.blogapp.entity.Bussiness;
import com.blogapp.entity.Comment;
import com.blogapp.entity.Father;
import com.blogapp.entity.Post;
import com.blogapp.entity.Profile;
import com.blogapp.entity.Station;
import com.blogapp.entity.Stop;
import com.blogapp.entity.Train;
import com.blogapp.entity.User;
import com.blogapp.repository.BusRepository;
import com.blogapp.repository.BussinessRepository;
import com.blogapp.repository.CommentRepository;
import com.blogapp.repository.FatherRepository;
import com.blogapp.repository.PostRepository;
import com.blogapp.repository.ProfileRepository;
import com.blogapp.repository.StationRepository;
import com.blogapp.repository.StopRepository;
import com.blogapp.repository.TrainRepository;
import com.blogapp.repository.UserRepository;

import jakarta.transaction.Transactional;

@SpringBootTest
class BlogappApplicationTests {
	
	@Autowired
	UserRepository userRep;
	@Autowired
	ProfileRepository profileRep;
	@Autowired
	 BussinessRepository BussRepo;
	@Autowired
	FatherRepository FathRepo;
	
	@Autowired
	TrainRepository trainRepo;
	@Autowired
	StationRepository stationRepo;
	
	@Autowired
    private BusRepository busRepo;

    @Autowired
    private StopRepository stopRepo;
    
    @Autowired
    private PostRepository postRepo;
    
    @Autowired
    private CommentRepository ComRepo;
	
	@Test
	public void UserAndProfile() {
		Profile profile=new Profile();
		profile.setBio("A Software Enginner");
		
		
		User user= new User();
		user.setName("Safiullh");
		user.setProfile(profile);
		
	    userRep.save(user);	
	}
	
	@Test
	public void FatherAndBussiness() {
		
		Bussiness bussi= new Bussiness();
		bussi.setBussinessName("Greengrosher");
		bussi.setAdddress("Ballia");
		bussi.setMobile("854698752");
		bussi.setAnnualEncome(3500000);
		
		
		Father father=new Father();
		father.setName("Shabbir Ahamed");
		father.setBussiness(bussi);
		FathRepo.save(father);
		
		
	}
	
	@Test
	public void TrainAndStation() {
	    Station s1 = new Station();
	    s1.setStationName("Ballia");

	    Station s2 = new Station();
	    s2.setStationName("Chhapra");

	    Station s3 = new Station();
	    s3.setStationName("Varansi");

	    stationRepo.saveAll(Arrays.asList(s1,s2,s3));
	    
	    
	    
	    Train t1 = new Train();
	    t1.setTrainName("vnsSuperFast 101");
	    t1.setStations(Arrays.asList(s1, s2));

	    Train t2 = new Train();
	    t2.setTrainName("Mau-Express 502");
	    t2.setStations(Arrays.asList(s1, s2));

	    Train t3 = new Train();
	    t3.setTrainName("Bhirgu-Expess 708");
	    t3.setStations(Arrays.asList(s1, s2));

	    trainRepo.saveAll(Arrays.asList(t1, t2, t3));
	}
	
	    @Test
        public void createBusWithStops() {
        Stop s1 = new Stop();
        s1.setStopName("Majestic");

        Stop s2 = new Stop();
        s2.setStopName("BTM Layout");

        Stop s3 = new Stop();
        s3.setStopName("Electronic City");

        stopRepo.saveAll(Arrays.asList(s1, s2, s3));

        Bus b1 = new Bus();
        b1.setBusName("Bus 101");
        b1.setStops(Arrays.asList(s1, s2));

        Bus b2 = new Bus();
        b2.setBusName("Bus 202");
        b2.setStops(Arrays.asList(s2, s3));

        busRepo.saveAll(Arrays.asList(b1, b2));
    }
	    
	    @Test
	    public void savePost() {
	    	Post post=new Post();
	    	post.setTitle("Amazon");
	    	postRepo.save(post);
	    	
	    }
	    
	    @Test
	    public void saveCommentOfPost() {
	    	long postId=1L;
	    	Post post=postRepo.findById(postId).orElseThrow();
	    	
	    	Comment comments=new Comment();
	    	comments.setContent("This website is very good");
	    	comments.setPost(post);
	    	
	    	ComRepo.save(comments);
	    }
	    @Transactional
		@Test
		public void getPostAndItsComments() {
		   
			Post post = postRepo.findById(1L).orElseThrow();
		    List<Comment> comments = post.getComments(); // Works because session is open
		    for (Comment c:comments) {
		    	System.out.println(c.getId());
				System.out.println(c.getContent());
			}
		}
		

	

}
